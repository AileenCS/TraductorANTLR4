package aileen.principal;

import aileen.parser.CalculadoraBaseVisitor;
import aileen.parser.CalculadoraParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.OptionalInt;


public  class MyVisitor  extends CalculadoraBaseVisitor<Object> {

    static HashMap<String, Double> memory = new HashMap<>();
    public static List<String> lista = new ArrayList<>();

    @Override
    public Object visitCalculadora(CalculadoraParser.CalculadoraContext ctx) {
       Controller.traducir("inicio programa(){" + "\n");

        return  visitChildren(ctx);
    }

    @Override
    public Double visitAsings(CalculadoraParser.AsingsContext ctx) {
        String id = ctx.ID().getText();
        Double value = (Double) this.visit(ctx.expr(0));

        Controller.traducir(id + "="+ value+ ";");
       // lc.add("\n" + id + "=" + value);
        if (!memory.containsKey(id)) {

            return memory.put(id, value);
        } else {

            Controller.static_error.setText("ERROR YA EXISTE UNA VARIABLE DECLARADA COMO   " + id);

        }
        return null;
    }


    @Override
    public Double visitPotencia(CalculadoraParser.PotenciaContext ctx) {
        double a = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        double b = (double) visit(ctx.expr(1));
        Controller.traducir(a + "^" + b);
        //lc.add(a + "^" + b);
        return Math.pow(a, b);

    }

    @Override
    public Double visitId(CalculadoraParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if (memory.containsKey(id)) {

            return memory.get(id);
        } else {
            Controller.static_error.setText("No esta declarada la variable: " + id);
            return null;

        }

    }

    @Override
    public String visitImprime(CalculadoraParser.ImprimeContext ctx) {
        Double value = (Double) this.visit(ctx.expr(0));

        Controller.add(String.valueOf(value));

        Controller.traducir("imprime" + "(" + value + ");");
       // lc.add("\n" + "\n" + "printf" + "(" + value + ");");
        return null;
    }

    @Override public Double visitImpr2(CalculadoraParser.Impr2Context ctx) {
        String value =  ctx.CADENA().getText();

        Controller.add(String.valueOf(value));

        Controller.traducir("imprime" + "(" + value + ");");
        // lc.add("\n" + "\n" + "printf" + "(" + value + ");");
        return null;
    }
    @Override
    public Boolean visitMayormenor(CalculadoraParser.MayormenorContext ctx) {
        double left = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        double right = (double) visit(ctx.expr(1));
        if (ctx.condicional.getText().equals(">")) {
         //   Controller.traducir(left + ">" + right );

            return left > right;
        }
        if (ctx.condicional.getText().equals("<")) {
          //  Controller.traducir( left + "<" + right );
         //   lc.add("\n" + "if" + "(" + left + "<" + right + ") {");
            return left < right;
        } else {

            Controller.static_error.setText("No coincide la operacion");
        }
        return null;
    }

    @Override
    public Boolean visitMayorigualmenorigual(CalculadoraParser.MayorigualmenorigualContext ctx) {
        double left = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        double right = (double) visit(ctx.expr(1));

        if (ctx.condicional.getText().equals(">=")) {
            return left >= right;
        } else if (ctx.condicional.getText().equals("<=")) {

            return left <= right;
        } else {

            Controller.static_error.setText("No coincide la operacion");
        }
        return null;
    }

    @Override
    public Boolean visitIgualdif(CalculadoraParser.IgualdifContext ctx) {
        double left = (double) visit(ctx.expr(0));
        double right = (double) visit(ctx.expr(1));

        if (ctx.condicional.getText().equals("==")) {
           // Controller.traducir( left + "==" + right );

            return left == right;
        } else if (ctx.condicional.getText().equals("!=")) {
         //   Controller.traducir( left + "!=" + right );
            return left != right;
        } else {

            Controller.static_error.setText("No coincide la operacion");
        }
        return null;
    }
    @Override
    public Object  visitAnds(CalculadoraParser.AndsContext ctx) {
        boolean left = (boolean) this.visit(ctx.expr(0));
         boolean  right = (boolean) this.visit(ctx.expr(1));

        Controller.traducir(left +  "&&" + right );
        return  left && right;
    }

    @Override public Object visitOrs(CalculadoraParser.OrsContext ctx) {
        boolean left = (boolean) this.visit(ctx.expr(0));
        boolean right = (boolean) this.visit(ctx.expr(1));
        if (ctx.logic.getText().equals("||")) {
            Controller.traducir(left + "||" + right);
        }
        return left || right;
        }
    @Override
    public Double visitAsigdeclaracion(CalculadoraParser.AsigdeclaracionContext ctx) {

            String type = ctx.type().getText();
            Double value = (Double) visit(ctx.expr().get(0));

                Controller.traducir(type + " " + ctx.ID().getText() + "= " + value + "; ");

            return (Double) visitChildren(ctx);
        }


    @Override
    public String visitC_elseif(CalculadoraParser.C_elseifContext ctx) {

            Controller.traducir("\n" + "else " + "if" + "(" + ctx.condiciones() + ") { ");
            //    visit(ctx.accion().get(i));

        return (String) visitChildren(ctx);
    }


        @Override public Boolean visitC_else (CalculadoraParser.C_elseContext ctx){

        Controller.traducir("\n" + "else " + "(" +   ctx.accion(0).getText() + ") { ");

        return true;
}



    @Override
    public Double visitDeclaraciones(CalculadoraParser.DeclaracionesContext ctx) {
        String type = ctx.type().toString();
        String id = ctx.ID().getText();
        String declaracion = type + id;

        if (type.equals("float ")) {
            Controller.traducir(  " flotante" + " " + ctx.ID().getText() + "; ");
        } else if (type.equals("int ")) {
            Controller.traducir(  " entero" + " " + ctx.ID().getText() + "; ");

        }

        return null;
    }


   @Override public Object visitCondicionif(CalculadoraParser.CondicionifContext ctx) {
           if ((boolean) visit(ctx.condiciones().get(0))) {
               for (int i = 0; i < ctx.accion().size(); i++) {
                   Controller.traducir("if" + "(" + ctx.condiciones(0).getText() + ") {");
                   visit(ctx.accion().get(i));
               }
           }
           return true;

       }
    @Override
    public Double visitMultDiv(CalculadoraParser.MultDivContext ctx) {
        double a = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        double b = (double) visit(ctx.expr(1));
        if (ctx.op.getText().equals("*"))
            return a * b;
        return a / b;
    }

    @Override
    public Double visitMasMenos(CalculadoraParser.MasMenosContext ctx) {
        double a = (double) visit(ctx.expr(0));
        //  System.out.println(ctx.getText());
        double b = (double) visit(ctx.expr(1));
        if (ctx.op.getText().equals("+"))
            return a + b;
        return a - b;
    }
    @Override public Boolean visitTrue(CalculadoraParser.TrueContext ctx) {

        return true;
    }
    @Override public Boolean visitFalse(CalculadoraParser.FalseContext ctx) {


        return false;}

    @Override
    public Double visitParentesiss(CalculadoraParser.ParentesissContext ctx) {
        return (Double) this.visit(ctx.expr());
    }
    @Override
    public Double visitNums(CalculadoraParser.NumsContext ctx) {

        return (Double.valueOf(ctx.getText()));

    }
}

