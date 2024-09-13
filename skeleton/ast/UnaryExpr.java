package ast;

public class UnaryExpr extends Expr {
    
        public static final int MINUS = 1;

        final int operator;
        final Expr expr;
    
        public UnaryExpr(int operator, Expr expr, Location loc) {
            super(loc);
            this.operator = operator;
            this.expr = expr;
        }
    
        public Expr getExpr() {
            return expr;
        }

        public int getOperator() {
            return operator;
        }
    
        @Override
        public String toString() {
            return "-" + expr;
        }
}
