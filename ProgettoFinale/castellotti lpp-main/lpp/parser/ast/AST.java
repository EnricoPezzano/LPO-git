package lpp.parser.ast;

import lpp.visitors.Visitor;

public interface AST {
	<T> T accept(Visitor<T> visitor);
}
