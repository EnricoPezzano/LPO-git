package lab11_05_14.parser.ast;

import lab11_05_14.visitors.Visitor;

public class Neq extends BinaryOp {
	public Neq(Exp left, Exp right) {
		super(left, right);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitNeq(left, right);
	}
}
