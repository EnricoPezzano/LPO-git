package lab11_05_14.parser.ast;

import lab11_05_14.visitors.Visitor;

public class Bounds extends UnaryOp {

	public Bounds(Exp exp) {
		super(exp);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitBounds(exp);
	}
}
