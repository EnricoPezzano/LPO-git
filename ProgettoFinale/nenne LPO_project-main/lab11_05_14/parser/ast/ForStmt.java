package lab11_05_14.parser.ast;

import lab11_05_14.visitors.Visitor;

import static java.util.Objects.requireNonNull;


public class ForStmt implements Stmt {
	private final VarIdent id;
	private final Exp exp;
	private final Block multi_stmt;
	
	public ForStmt(VarIdent id, Exp exp, Block multi_stmt) {
		this.id = requireNonNull(id);
		this.exp = requireNonNull(exp);
		this.multi_stmt = requireNonNull(multi_stmt);
	}

	/*@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + id + "," + exp + "," + stmts + ")";
	}*/

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitForStmt(id, exp, multi_stmt);
	}
}
