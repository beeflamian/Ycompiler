import java.util.HashMap;
import java.util.Map;

public class SymbolTable {

    private String curScope;
    private String curVarType;
    private String symbolId;

    HashMap<String, SymbolObject> symbol = new HashMap<String, SymbolObject>();

    public SymbolTable() {
    }
    public SymbolTable(String newScope) {
	this.curScope = newScope;
    }

    public boolean isLegal(SymbolObject newSymbol) {
	symbolId = newSymbol.getId();
	if(symbol.containsKey(symbolId))
	    return false;
	else
	    return true;
    }

    public HashMap<String, SymbolObject> getSymbols() {
	return symbol;
    }
    public SymbolObject getSymbol(String symbolName) {
	return symbol.get(symbolName);
    }
    public void addToTab(SymbolObject newSymbol) {
	symbol.put(newSymbol.getId(), newSymbol);
    }
    public void setScopeId(String id) {
	curScope = id;
    }
    public String getScopeId() {
	return curScope;
    }
    public void setVarType(String type) {
	curVarType = type;
    }
    public String getVarType() {
	return curVarType;
    }
    public void printErr() {
	System.out.println("DECLARATION ERROR " + symbolId);
    }
}
