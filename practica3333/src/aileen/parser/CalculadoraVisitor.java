// Generated from Calculadora.g4 by ANTLR 4.7.2
package aileen.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#calculadora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculadora(CalculadoraParser.CalculadoraContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(CalculadoraParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaraciones}
	 * labeled alternative in {@link CalculadoraParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(CalculadoraParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asings}
	 * labeled alternative in {@link CalculadoraParser#asing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsings(CalculadoraParser.AsingsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigdeclaracion}
	 * labeled alternative in {@link CalculadoraParser#asingmasdeclara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigdeclaracion(CalculadoraParser.AsigdeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CalculadoraParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#imprime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprime(CalculadoraParser.ImprimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#impr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpr2(CalculadoraParser.Impr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(CalculadoraParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potencia}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(CalculadoraParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(CalculadoraParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesiss}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesiss(CalculadoraParser.ParentesissContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CalculadoraParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masMenos}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasMenos(CalculadoraParser.MasMenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nums}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(CalculadoraParser.NumsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayormenor}
	 * labeled alternative in {@link CalculadoraParser#contenido_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayormenor(CalculadoraParser.MayormenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorigualmenorigual}
	 * labeled alternative in {@link CalculadoraParser#contenido_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorigualmenorigual(CalculadoraParser.MayorigualmenorigualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualdif}
	 * labeled alternative in {@link CalculadoraParser#contenido_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdif(CalculadoraParser.IgualdifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link CalculadoraParser#contenido_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(CalculadoraParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link CalculadoraParser#contenido_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(CalculadoraParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ands}
	 * labeled alternative in {@link CalculadoraParser#condicion_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnds(CalculadoraParser.AndsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ors}
	 * labeled alternative in {@link CalculadoraParser#condicion_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrs(CalculadoraParser.OrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#condiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(CalculadoraParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#condicionif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionif(CalculadoraParser.CondicionifContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#c_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_else(CalculadoraParser.C_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#c_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_elseif(CalculadoraParser.C_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculadoraParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(CalculadoraParser.ForConditionContext ctx);
}