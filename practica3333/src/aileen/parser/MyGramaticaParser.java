// Generated from MyGramatica.g4 by ANTLR 4.7.2
package aileen.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, INICIO=4, PROGRAMA=5, FLOTANTE=6, MAS=7, MENOS=8, 
		POR=9, DIV=10, IGUAL=11, ENTERO=12, FLOAT=13, CADENA=14, POW=15, PA=16, 
		PC=17, MAYOR=18, MENOR=19, MAYOR_IGUAL=20, IF=21, ELSE=22, MENOR_IGUAL=23, 
		IGUALIGUAL=24, DIFERENTE=25, LA=26, LC=27, ID=28, INT=29, SEMI=30, FLOATANTE=31, 
		FOR=32, TRUE=33, FALSE=34, SALTO=35;
	public static final int
		RULE_calculadora = 0, RULE_contenido = 1, RULE_declaracion = 2, RULE_asing = 3, 
		RULE_asingmasdeclara = 4, RULE_type = 5, RULE_imprime = 6, RULE_impr2 = 7, 
		RULE_accion = 8, RULE_expr = 9, RULE_unaryExpression = 10, RULE_contenido_exp = 11, 
		RULE_condicion_logical = 12, RULE_condicion = 13, RULE_condicionif = 14, 
		RULE_c_else = 15, RULE_c_elseif = 16, RULE_forCondition = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculadora", "contenido", "declaracion", "asing", "asingmasdeclara", 
			"type", "imprime", "impr2", "accion", "expr", "unaryExpression", "contenido_exp", 
			"condicion_logical", "condicion", "condicionif", "c_else", "c_elseif", 
			"forCondition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'printf'", "'++'", "'--'", "'inicio'", "'programa'", null, "'+'", 
			"'-'", "'*'", "'/'", "'='", "'int'", "'float'", null, "'^'", "'('", "')'", 
			"'>'", "'<'", "'>='", "'if'", "'else'", "'<='", "'=='", "'!='", "'{'", 
			"'}'", null, null, "';'", null, "'for'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INICIO", "PROGRAMA", "FLOTANTE", "MAS", "MENOS", 
			"POR", "DIV", "IGUAL", "ENTERO", "FLOAT", "CADENA", "POW", "PA", "PC", 
			"MAYOR", "MENOR", "MAYOR_IGUAL", "IF", "ELSE", "MENOR_IGUAL", "IGUALIGUAL", 
			"DIFERENTE", "LA", "LC", "ID", "INT", "SEMI", "FLOATANTE", "FOR", "TRUE", 
			"FALSE", "SALTO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CalculadoraContext extends ParserRuleContext {
		public ContenidoContext contenido() {
			return getRuleContext(ContenidoContext.class,0);
		}
		public CalculadoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculadora; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitCalculadora(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculadoraContext calculadora() throws RecognitionException {
		CalculadoraContext _localctx = new CalculadoraContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculadora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			contenido();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContenidoContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(MyGramaticaParser.INICIO, 0); }
		public TerminalNode PROGRAMA() { return getToken(MyGramaticaParser.PROGRAMA, 0); }
		public TerminalNode PA() { return getToken(MyGramaticaParser.PA, 0); }
		public TerminalNode PC() { return getToken(MyGramaticaParser.PC, 0); }
		public TerminalNode LA() { return getToken(MyGramaticaParser.LA, 0); }
		public TerminalNode LC() { return getToken(MyGramaticaParser.LC, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public ContenidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitContenido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContenidoContext contenido() throws RecognitionException {
		ContenidoContext _localctx = new ContenidoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_contenido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(INICIO);
			setState(39);
			match(PROGRAMA);
			setState(40);
			match(PA);
			setState(41);
			match(PC);
			setState(42);
			match(LA);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(43);
				accion();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	 
		public DeclaracionContext() { }
		public void copyFrom(DeclaracionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclaracionesContext extends DeclaracionContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyGramaticaParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(MyGramaticaParser.SEMI, 0); }
		public DeclaracionesContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			_localctx = new DeclaracionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			type();
			setState(52);
			match(ID);
			setState(53);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsingContext extends ParserRuleContext {
		public AsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asing; }
	 
		public AsingContext() { }
		public void copyFrom(AsingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsingsContext extends AsingContext {
		public TerminalNode ID() { return getToken(MyGramaticaParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MyGramaticaParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MyGramaticaParser.SEMI, 0); }
		public AsingsContext(AsingContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitAsings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsingContext asing() throws RecognitionException {
		AsingContext _localctx = new AsingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asing);
		try {
			_localctx = new AsingsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(ID);
			setState(56);
			match(IGUAL);
			setState(57);
			expr(0);
			setState(58);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsingmasdeclaraContext extends ParserRuleContext {
		public AsingmasdeclaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asingmasdeclara; }
	 
		public AsingmasdeclaraContext() { }
		public void copyFrom(AsingmasdeclaraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsigdeclaracionContext extends AsingmasdeclaraContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyGramaticaParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(MyGramaticaParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MyGramaticaParser.SEMI, 0); }
		public AsigdeclaracionContext(AsingmasdeclaraContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitAsigdeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsingmasdeclaraContext asingmasdeclara() throws RecognitionException {
		AsingmasdeclaraContext _localctx = new AsingmasdeclaraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asingmasdeclara);
		try {
			_localctx = new AsigdeclaracionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(61);
			match(ID);
			setState(62);
			match(IGUAL);
			setState(63);
			expr(0);
			setState(64);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(MyGramaticaParser.ENTERO, 0); }
		public TerminalNode FLOAT() { return getToken(MyGramaticaParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(MyGramaticaParser.PA, 0); }
		public TerminalNode PC() { return getToken(MyGramaticaParser.PC, 0); }
		public TerminalNode SEMI() { return getToken(MyGramaticaParser.SEMI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitImprime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imprime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			match(PA);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << ID) | (1L << INT) | (1L << FLOATANTE))) != 0)) {
				{
				{
				setState(70);
				expr(0);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(PC);
			setState(77);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Impr2Context extends ParserRuleContext {
		public TerminalNode PA() { return getToken(MyGramaticaParser.PA, 0); }
		public TerminalNode CADENA() { return getToken(MyGramaticaParser.CADENA, 0); }
		public TerminalNode PC() { return getToken(MyGramaticaParser.PC, 0); }
		public TerminalNode SEMI() { return getToken(MyGramaticaParser.SEMI, 0); }
		public Impr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impr2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitImpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Impr2Context impr2() throws RecognitionException {
		Impr2Context _localctx = new Impr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_impr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			match(PA);
			setState(81);
			match(CADENA);
			setState(82);
			match(PC);
			setState(83);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccionContext extends ParserRuleContext {
		public AsingContext asing() {
			return getRuleContext(AsingContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsingmasdeclaraContext asingmasdeclara() {
			return getRuleContext(AsingmasdeclaraContext.class,0);
		}
		public CondicionifContext condicionif() {
			return getRuleContext(CondicionifContext.class,0);
		}
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public Impr2Context impr2() {
			return getRuleContext(Impr2Context.class,0);
		}
		public AccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitAccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_accion);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				asing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				asingmasdeclara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				condicionif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				imprime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				impr2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PotenciaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(MyGramaticaParser.POW, 0); }
		public PotenciaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitPotencia(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POR() { return getToken(MyGramaticaParser.POR, 0); }
		public TerminalNode DIV() { return getToken(MyGramaticaParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesissContext extends ExprContext {
		public TerminalNode PA() { return getToken(MyGramaticaParser.PA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(MyGramaticaParser.PC, 0); }
		public ParentesissContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitParentesiss(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(MyGramaticaParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MasMenosContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAS() { return getToken(MyGramaticaParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(MyGramaticaParser.MENOS, 0); }
		public MasMenosContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitMasMenos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumsContext extends ExprContext {
		public TerminalNode INT() { return getToken(MyGramaticaParser.INT, 0); }
		public TerminalNode FLOATANTE() { return getToken(MyGramaticaParser.FLOATANTE, 0); }
		public NumsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitNums(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOATANTE:
				{
				_localctx = new NumsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(94);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOATANTE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(ID);
				}
				break;
			case PA:
				{
				_localctx = new ParentesissContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				match(PA);
				setState(97);
				expr(0);
				setState(98);
				match(PC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PotenciaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(103);
						match(POW);
						setState(104);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==POR || _la==DIV) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new MasMenosContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						((MasMenosContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((MasMenosContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Contenido_expContext extends ParserRuleContext {
		public Contenido_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenido_exp; }
	 
		public Contenido_expContext() { }
		public void copyFrom(Contenido_expContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IgualdifContext extends Contenido_expContext {
		public Token condicional;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUALIGUAL() { return getToken(MyGramaticaParser.IGUALIGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(MyGramaticaParser.DIFERENTE, 0); }
		public IgualdifContext(Contenido_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitIgualdif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayorigualmenorigualContext extends Contenido_expContext {
		public Token condicional;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR_IGUAL() { return getToken(MyGramaticaParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(MyGramaticaParser.MENOR_IGUAL, 0); }
		public MayorigualmenorigualContext(Contenido_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitMayorigualmenorigual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayormenorContext extends Contenido_expContext {
		public Token condicional;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(MyGramaticaParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(MyGramaticaParser.MENOR, 0); }
		public MayormenorContext(Contenido_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitMayormenor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contenido_expContext contenido_exp() throws RecognitionException {
		Contenido_expContext _localctx = new Contenido_expContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contenido_exp);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MayormenorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				expr(0);
				setState(119);
				((MayormenorContext)_localctx).condicional = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MAYOR || _la==MENOR) ) {
					((MayormenorContext)_localctx).condicional = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
				expr(0);
				}
				break;
			case 2:
				_localctx = new MayorigualmenorigualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				expr(0);
				setState(123);
				((MayorigualmenorigualContext)_localctx).condicional = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MAYOR_IGUAL || _la==MENOR_IGUAL) ) {
					((MayorigualmenorigualContext)_localctx).condicional = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(124);
				expr(0);
				}
				break;
			case 3:
				_localctx = new IgualdifContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				expr(0);
				setState(127);
				((IgualdifContext)_localctx).condicional = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IGUALIGUAL || _la==DIFERENTE) ) {
					((IgualdifContext)_localctx).condicional = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(128);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condicion_logicalContext extends ParserRuleContext {
		public Condicion_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion_logical; }
	 
		public Condicion_logicalContext() { }
		public void copyFrom(Condicion_logicalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueContext extends Condicion_logicalContext {
		public TerminalNode TRUE() { return getToken(MyGramaticaParser.TRUE, 0); }
		public TrueContext(Condicion_logicalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends Condicion_logicalContext {
		public TerminalNode FALSE() { return getToken(MyGramaticaParser.FALSE, 0); }
		public FalseContext(Condicion_logicalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicion_logicalContext condicion_logical() throws RecognitionException {
		Condicion_logicalContext _localctx = new Condicion_logicalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condicion_logical);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Contenido_expContext contenido_exp() {
			return getRuleContext(Contenido_expContext.class,0);
		}
		public Condicion_logicalContext condicion_logical() {
			return getRuleContext(Condicion_logicalContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(136);
				expr(0);
				setState(137);
				contenido_exp();
				setState(138);
				expr(0);
				}
				break;
			case 2:
				{
				setState(140);
				expr(0);
				setState(141);
				condicion_logical();
				setState(142);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MyGramaticaParser.IF, 0); }
		public TerminalNode PA() { return getToken(MyGramaticaParser.PA, 0); }
		public TerminalNode PC() { return getToken(MyGramaticaParser.PC, 0); }
		public TerminalNode LA() { return getToken(MyGramaticaParser.LA, 0); }
		public TerminalNode LC() { return getToken(MyGramaticaParser.LC, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public List<C_elseifContext> c_elseif() {
			return getRuleContexts(C_elseifContext.class);
		}
		public C_elseifContext c_elseif(int i) {
			return getRuleContext(C_elseifContext.class,i);
		}
		public C_elseContext c_else() {
			return getRuleContext(C_elseContext.class,0);
		}
		public CondicionifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionif; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitCondicionif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionifContext condicionif() throws RecognitionException {
		CondicionifContext _localctx = new CondicionifContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicionif);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(147);
			match(PA);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << ID) | (1L << INT) | (1L << FLOATANTE))) != 0)) {
				{
				{
				setState(148);
				condicion();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			match(PC);
			setState(155);
			match(LA);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(156);
				accion();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(LC);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(163);
					c_elseif();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(169);
				c_else();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_elseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MyGramaticaParser.ELSE, 0); }
		public TerminalNode LA() { return getToken(MyGramaticaParser.LA, 0); }
		public TerminalNode LC() { return getToken(MyGramaticaParser.LC, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public C_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitC_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_elseContext c_else() throws RecognitionException {
		C_elseContext _localctx = new C_elseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_c_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ELSE);
			setState(173);
			match(LA);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(174);
				accion();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_elseifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(MyGramaticaParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(MyGramaticaParser.IF, 0); }
		public TerminalNode PA() { return getToken(MyGramaticaParser.PA, 0); }
		public TerminalNode PC() { return getToken(MyGramaticaParser.PC, 0); }
		public TerminalNode LA() { return getToken(MyGramaticaParser.LA, 0); }
		public TerminalNode LC() { return getToken(MyGramaticaParser.LC, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public C_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_elseif; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitC_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_elseifContext c_elseif() throws RecognitionException {
		C_elseifContext _localctx = new C_elseifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_c_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ELSE);
			setState(183);
			match(IF);
			setState(184);
			match(PA);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PA) | (1L << ID) | (1L << INT) | (1L << FLOATANTE))) != 0)) {
				{
				{
				setState(185);
				condicion();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(PC);
			setState(192);
			match(LA);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(193);
				accion();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(LC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MyGramaticaParser.FOR, 0); }
		public TerminalNode PA() { return getToken(MyGramaticaParser.PA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode LA() { return getToken(MyGramaticaParser.LA, 0); }
		public List<AccionContext> accion() {
			return getRuleContexts(AccionContext.class);
		}
		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(FOR);
			setState(202);
			match(PA);
			setState(203);
			declaracion();
			setState(204);
			match(LA);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(205);
				accion();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\7\bJ\n\b\f\b\16\bM\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13g\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13r\n"+
		"\13\f\13\16\13u\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0085\n\r\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u0093\n\17\3\20\3\20\3\20\7\20\u0098\n\20\f\20"+
		"\16\20\u009b\13\20\3\20\3\20\3\20\7\20\u00a0\n\20\f\20\16\20\u00a3\13"+
		"\20\3\20\3\20\7\20\u00a7\n\20\f\20\16\20\u00aa\13\20\3\20\5\20\u00ad\n"+
		"\20\3\21\3\21\3\21\7\21\u00b2\n\21\f\21\16\21\u00b5\13\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\7\22\u00bd\n\22\f\22\16\22\u00c0\13\22\3\22\3\22\3"+
		"\22\7\22\u00c5\n\22\f\22\16\22\u00c8\13\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\7\23\u00d1\n\23\f\23\16\23\u00d4\13\23\3\23\3\u00a8\3\24\24\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\n\3\2\16\17\4\2\37\37!!\3"+
		"\2\13\f\3\2\t\n\3\2\4\5\3\2\24\25\4\2\26\26\31\31\3\2\32\33\2\u00db\2"+
		"&\3\2\2\2\4(\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\fD\3\2\2\2\16"+
		"F\3\2\2\2\20Q\3\2\2\2\22]\3\2\2\2\24f\3\2\2\2\26v\3\2\2\2\30\u0084\3\2"+
		"\2\2\32\u0088\3\2\2\2\34\u0092\3\2\2\2\36\u0094\3\2\2\2 \u00ae\3\2\2\2"+
		"\"\u00b8\3\2\2\2$\u00cb\3\2\2\2&\'\5\4\3\2\'\3\3\2\2\2()\7\6\2\2)*\7\7"+
		"\2\2*+\7\22\2\2+,\7\23\2\2,\60\7\34\2\2-/\5\22\n\2.-\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\35\2"+
		"\2\64\5\3\2\2\2\65\66\5\f\7\2\66\67\7\36\2\2\678\7 \2\28\7\3\2\2\29:\7"+
		"\36\2\2:;\7\r\2\2;<\5\24\13\2<=\7 \2\2=\t\3\2\2\2>?\5\f\7\2?@\7\36\2\2"+
		"@A\7\r\2\2AB\5\24\13\2BC\7 \2\2C\13\3\2\2\2DE\t\2\2\2E\r\3\2\2\2FG\7\3"+
		"\2\2GK\7\22\2\2HJ\5\24\13\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN"+
		"\3\2\2\2MK\3\2\2\2NO\7\23\2\2OP\7 \2\2P\17\3\2\2\2QR\7\3\2\2RS\7\22\2"+
		"\2ST\7\20\2\2TU\7\23\2\2UV\7 \2\2V\21\3\2\2\2W^\5\b\5\2X^\5\6\4\2Y^\5"+
		"\n\6\2Z^\5\36\20\2[^\5\16\b\2\\^\5\20\t\2]W\3\2\2\2]X\3\2\2\2]Y\3\2\2"+
		"\2]Z\3\2\2\2][\3\2\2\2]\\\3\2\2\2^\23\3\2\2\2_`\b\13\1\2`g\t\3\2\2ag\7"+
		"\36\2\2bc\7\22\2\2cd\5\24\13\2de\7\23\2\2eg\3\2\2\2f_\3\2\2\2fa\3\2\2"+
		"\2fb\3\2\2\2gs\3\2\2\2hi\f\b\2\2ij\7\21\2\2jr\5\24\13\tkl\f\7\2\2lm\t"+
		"\4\2\2mr\5\24\13\bno\f\6\2\2op\t\5\2\2pr\5\24\13\7qh\3\2\2\2qk\3\2\2\2"+
		"qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\25\3\2\2\2us\3\2\2\2vw\t\6\2"+
		"\2w\27\3\2\2\2xy\5\24\13\2yz\t\7\2\2z{\5\24\13\2{\u0085\3\2\2\2|}\5\24"+
		"\13\2}~\t\b\2\2~\177\5\24\13\2\177\u0085\3\2\2\2\u0080\u0081\5\24\13\2"+
		"\u0081\u0082\t\t\2\2\u0082\u0083\5\24\13\2\u0083\u0085\3\2\2\2\u0084x"+
		"\3\2\2\2\u0084|\3\2\2\2\u0084\u0080\3\2\2\2\u0085\31\3\2\2\2\u0086\u0089"+
		"\7#\2\2\u0087\u0089\7$\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\33\3\2\2\2\u008a\u008b\5\24\13\2\u008b\u008c\5\30\r\2\u008c\u008d\5\24"+
		"\13\2\u008d\u0093\3\2\2\2\u008e\u008f\5\24\13\2\u008f\u0090\5\32\16\2"+
		"\u0090\u0091\5\24\13\2\u0091\u0093\3\2\2\2\u0092\u008a\3\2\2\2\u0092\u008e"+
		"\3\2\2\2\u0093\35\3\2\2\2\u0094\u0095\7\27\2\2\u0095\u0099\7\22\2\2\u0096"+
		"\u0098\5\34\17\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c"+
		"\u009d\7\23\2\2\u009d\u00a1\7\34\2\2\u009e\u00a0\5\22\n\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a8\7\35\2\2\u00a5\u00a7\5"+
		"\"\22\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\5 "+
		"\21\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00af"+
		"\7\30\2\2\u00af\u00b3\7\34\2\2\u00b0\u00b2\5\22\n\2\u00b1\u00b0\3\2\2"+
		"\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\35\2\2\u00b7!\3\2\2\2\u00b8"+
		"\u00b9\7\30\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00be\7\22\2\2\u00bb\u00bd"+
		"\5\34\17\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2"+
		"\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\7\23\2\2\u00c2\u00c6\7\34\2\2\u00c3\u00c5\5\22\n\2\u00c4\u00c3\3\2\2"+
		"\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\35\2\2\u00ca#\3\2\2\2\u00cb"+
		"\u00cc\7\"\2\2\u00cc\u00cd\7\22\2\2\u00cd\u00ce\5\6\4\2\u00ce\u00d2\7"+
		"\34\2\2\u00cf\u00d1\5\22\n\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3%\3\2\2\2\u00d4\u00d2\3\2\2\2"+
		"\23\60K]fqs\u0084\u0088\u0092\u0099\u00a1\u00a8\u00ac\u00b3\u00be\u00c6"+
		"\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}