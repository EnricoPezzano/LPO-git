package lpp.parser.ast;

import static java.util.Objects.requireNonNull;

import lpp.visitors.Visitor;

public class ForStmt implements Stmt {

    private final VarIdentAST ident;
    private final Exp exp;
	private final Block block;

	public ForStmt(VarIdentAST ident, Exp exp, Block block) {
        this.ident = requireNonNull(ident);
		this.exp = requireNonNull(exp);
		this.block = requireNonNull(block);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + ident + "," + exp + "," + block + ")";
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitForStmt(ident, exp, block);
	}

}
