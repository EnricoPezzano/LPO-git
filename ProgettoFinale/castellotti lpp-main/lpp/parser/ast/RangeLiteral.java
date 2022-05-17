package lpp.parser.ast;

import lpp.visitors.Visitor;

public class RangeLiteral extends BinaryOp {

	public RangeLiteral(Exp left, Exp right) {
		super(left, right);
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visitRangeLiteral(left, right);
	}
}