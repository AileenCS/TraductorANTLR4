// Generated from MyGramatica.g4 by ANTLR 4.7.2
package aileen.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#calculadora}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculadora(MyGramaticaParser.CalculadoraContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(MyGramaticaParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declaraciones}
	 * labeled alternative in {@link MyGramaticaParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(MyGramaticaParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asings}
	 * labeled alternative in {@link MyGramaticaParser#asing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsings(MyGramaticaParser.AsingsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigdeclaracion}
	 * labeled alternative in {@link MyGramaticaParser#asingmasdeclara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigdeclaracion(MyGramaticaParser.AsigdeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MyGramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#imprime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprime(MyGramaticaParser.ImprimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#impr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpr2(MyGramaticaParser.Impr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#accion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccion(MyGramaticaParser.AccionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code potencia}
	 * labeled alternative in {@link MyGramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotencia(MyGramaticaParser.PotenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link MyGramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(MyGramaticaParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentesiss}
	 * labeled alternative in {@link MyGramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesiss(MyGramaticaParser.ParentesissContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link MyGramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(MyGramaticaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masMenos}
	 * labeled alternative in {@link MyGramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasMenos(MyGramaticaParser.MasMenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nums}
	 * labeled alternative in {@link MyGramaticaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNums(MyGramaticaParser.NumsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MyGramaticaParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayormenor}
	 * labeled alternative in {@link MyGramaticaParser#contenido_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayormenor(MyGramaticaParser.MayormenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mayorigualmenorigual}
	 * labeled alternative in {@link MyGramaticaParser#contenido_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorigualmenorigual(MyGramaticaParser.MayorigualmenorigualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igualdif}
	 * labeled alternative in {@link MyGramaticaParser#contenido_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdif(MyGramaticaParser.IgualdifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link MyGramaticaParser#condicion_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(MyGramaticaParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link MyGramaticaParser#condicion_logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(MyGramaticaParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(MyGramaticaParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#condicionif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionif(MyGramaticaParser.CondicionifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#c_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_else(MyGramaticaParser.C_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#c_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_elseif(MyGramaticaParser.C_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(MyGramaticaParser.ForConditionContext ctx);
}