public interface ASTVisitor<T> {
    T visit(Id id);
    T visit(Int intt);
    T visit(If iff);
    // TODO2: Adăugați metode pentru fiecare clasă definită anterior
    T visit(Call call);
    T visit(UnaryMinus unaryMinus);
    T visit(MultDiv multDiv);
    T visit(PlusMinus plusMinus);
    T visit(Relational relational);
    T visit(Assign assign);
    T visit(Float floatt);
    T visit(Bool booll);
    T visit(Formal formal);
    T visit(VarDef varDef);
    T visit(FuncDef funcDef);
    T visit(Program program);
}
