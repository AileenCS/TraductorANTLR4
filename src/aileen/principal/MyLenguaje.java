package aileen.principal;


import aileen.parser.MyGramaticaBaseVisitor;
import aileen.parser.MyGramaticaParser;

public class MyLenguaje extends MyGramaticaBaseVisitor {



    @Override public String visitCalculadora(MyGramaticaParser.CalculadoraContext ctx) {
        //  lista.add("inicio programa(){" + "\n");
        Controller.traducir("void main(){" + "\n");
        return (String) visitChildren(ctx);
    }

    @Override public Double visitAsings(MyGramaticaParser.AsingsContext ctx) {
        String id = ctx.ID().getText();
        Double value = (Double) visit(ctx.expr());

        Controller.traducir(id + "=" + ctx.expr().getText() + ";");
        return (Double) visitChildren(ctx);
    }

    @Override public Double visitAsigdeclaracion(MyGramaticaParser.AsigdeclaracionContext ctx) {
        String type = ctx.type().getText();
        Double value = (Double) visit(ctx.expr());

            Controller.traducir(type + " " + ctx.ID().getText() + "= " + value + "; ");

        return (Double) visitChildren(ctx);
    }

    @Override public Boolean visitMayormenor(MyGramaticaParser.MayormenorContext ctx) {
        Double left = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        Double right = (double) visit(ctx.expr(1));
        if (ctx.condicional.getText().equals(">")) {

            Controller.traducir("\n" + "if" + "(" + left + ">" + right + ") {");
        }
        if (ctx.condicional.getText().equals("<")) {


            Controller.traducir("\n" + "if" + "(" + left + "<" + right + ") {");
        } else {

            Controller.static_error.setText("No coincide la operacion");
        }
        return false;
    }

    @Override public Boolean visitMayorigualmenorigual(MyGramaticaParser.MayorigualmenorigualContext ctx) {
        double left = (double)visit(ctx.expr(0));
        double right =(double)visit(ctx.expr(1));
        if (ctx.condicional.getText().equals(">=")) {
            Controller.traducir("\n" + "if" + "(" + left + ">=" + right + ") {");
        } else if (ctx.condicional.getText().equals("<=")) {
            Controller.traducir("\n" + "if" + "(" + left + "<=" + right + ") {");
        }
        return false;
    }

    @Override public Boolean visitIgualdif(MyGramaticaParser.IgualdifContext ctx) {
        double left = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        double right = (double) visit(ctx.expr(1));

        if (ctx.condicional.getText().equals("==")) {
            Controller.traducir("\n" + "if" + "(" + left + "==" + right + ") {");

        } else if (ctx.condicional.getText().equals("!=")) {
            Controller.traducir("\n" + "if" + "(" + left + "!=" + right + ") {");

        } else {

            Controller.static_error.setText("No coincide la operacion");
        }
        return false;
    }


    @Override public Boolean visitC_elseif(MyGramaticaParser.C_elseifContext ctx) {

        Controller.traducir("\n" + "else " + "if" + "(" + ctx.condicion() + ") { ");
        //    System.out.println(lista);
        return true;
    }
    @Override public Boolean visitC_else(MyGramaticaParser.C_elseContext ctx) {
            for (int i = 0; i < ctx.accion().size(); i++) {
                visit(ctx.accion(i));
                Controller.traducir("\n" + "else " + "(" +   ctx.accion(i) + ") { ");

            }


        return null;

    }

    @Override public Double visitImprime(MyGramaticaParser.ImprimeContext ctx) {
        Double value = (Double) this.visit(ctx.expr(0));

        Controller.add(String.valueOf(value));

        Controller.traducir("\n" + "\n" + "printf" + "(" + value + ");");

        return null;
    }

    @Override public String visitImpr2(MyGramaticaParser.Impr2Context ctx) {
        String value =  ctx.CADENA().getText();

        Controller.add(String.valueOf(value));

        Controller.traducir("\n" + "\n" + "printf" + "(" + value + ");");
        // lc.add("\n" + "\n" + "printf" + "(" + value + ");");
        return null;
    }



    @Override public String visitCondicionif(MyGramaticaParser.CondicionifContext ctx) {
        if ((boolean) visit(ctx.condicion(0))){
            for (int i = 0; i < ctx.accion().size(); i++) {
                visit(ctx.accion(i));}
        } else{
            Controller.traducir("if" + "("  + ctx.condicion(0)+ ") {");}
        return "true";

    }

    @Override public Boolean visitTrue(MyGramaticaParser.TrueContext ctx) {
        return true;
    }
    @Override public Boolean visitFalse(MyGramaticaParser.FalseContext ctx) {
        return false;
    }
    @Override public Object visitMultDiv(MyGramaticaParser.MultDivContext ctx) {
        double a = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        double b = (double) visit(ctx.expr(1));

        return a + ctx.op.getText()+b;
    }



    @Override public Object visitMasMenos(MyGramaticaParser.MasMenosContext ctx) {
        double a = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        double b = (double) visit(ctx.expr(1));

        return a + ctx.op.getText()+b;
    }

}