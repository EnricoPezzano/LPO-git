package lpp.parser.ast;

import lpp.visitors.Visitor;

public class BoundsOp extends UnaryOp {
    
	public BoundsOp(Exp exp) {
		super(exp);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitBoundsOp(exp);
	}
}
