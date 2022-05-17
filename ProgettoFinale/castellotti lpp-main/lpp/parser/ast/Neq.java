package lpp.parser.ast;

import lpp.visitors.Visitor;

public class Neq extends BinaryOp {
	public Neq(Exp left, Exp right) {
		super(left, right);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitNeq(left, right);
	}
}
