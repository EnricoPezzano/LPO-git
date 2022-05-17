package lpp.parser.ast;

import lpp.visitors.Visitor;

public class SingleStmt extends Single<Stmt> implements StmtSeq {

	public SingleStmt(Stmt single) {
		super(single);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitSingleStmt(single);
	}
}
