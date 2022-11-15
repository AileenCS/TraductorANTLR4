// Generated from Calculadora.g4 by ANTLR 4.7.2
package aileen.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculadoraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, VOID=3, MAIN=4, FLOTANTE=5, MAS=6, MENOS=7, POR=8, DIV=9, 
		IGUAL=10, CADENA=11, AND=12, OR=13, ANDAND=14, OROR=15, ENTERO=16, FLOAT=17, 
		POW=18, PA=19, PC=20, MAYOR=21, MENOR=22, MAYOR_IGUAL=23, MENOR_IGUAL=24, 
		IF=25, ELSE=26, IGUALIGUAL=27, DIFERENTE=28, LA=29, LC=30, ID=31, INT=32, 
		SEMI=33, FLOATANTE=34, FOR=35, TRUE=36, FALSE=37, SALTO=38;
	public static final int
		RULE_calculadora = 0, RULE_contenido = 1, RULE_declaracion = 2, RULE_asing = 3, 
		RULE_asingmasdeclara = 4, RULE_type = 5, RULE_imprime = 6, RULE_impr2 = 7, 
		RULE_accion = 8, RULE_expr = 9, RULE_contenido_exp = 10, RULE_condicion_logical = 11, 
		RULE_condiciones = 12, RULE_condicionif = 13, RULE_c_else = 14, RULE_c_elseif = 15, 
		RULE_forCondition = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"calculadora", "contenido", "declaracion", "asing", "asingmasdeclara", 
			"type", "imprime", "impr2", "accion", "expr", "contenido_exp", "condicion_logical", 
			"condiciones", "condicionif", "c_else", "c_elseif", "forCondition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#include <stdio.h>'", "'printf'", "'void'", "'main'", null, "'+'", 
			"'-'", "'*'", "'/'", "'='", null, "'&'", "'|'", "'&&'", "'||'", "'int'", 
			"'float'", "'^'", "'('", "')'", "'>'", "'<'", "'>='", "'<='", "'if'", 
			"'else'", "'=='", "'!='", "'{'", "'}'", null, null, "';'", null, "'for'", 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "VOID", "MAIN", "FLOTANTE", "MAS", "MENOS", "POR", 
			"DIV", "IGUAL", "CADENA", "AND", "OR", "ANDAND", "OROR", "ENTERO", "FLOAT", 
			"POW", "PA", "PC", "MAYOR", "MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", "IF", 
			"ELSE", "IGUALIGUAL", "DIFERENTE", "LA", "LC", "ID", "INT", "SEMI", "FLOATANTE", 
			"FOR", "TRUE", "FALSE", "SALTO"
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
	public String getGrammarFileName() { return "Calculadora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculadoraParser(TokenStream input) {
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
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitCalculadora(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalculadoraContext calculadora() throws RecognitionException {
		CalculadoraContext _localctx = new CalculadoraContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_calculadora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
		public TerminalNode VOID() { return getToken(CalculadoraParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(CalculadoraParser.MAIN, 0); }
		public TerminalNode PA() { return getToken(CalculadoraParser.PA, 0); }
		public TerminalNode PC() { return getToken(CalculadoraParser.PC, 0); }
		public TerminalNode LA() { return getToken(CalculadoraParser.LA, 0); }
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
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitContenido(this);
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
			setState(36);
			match(T__0);
			setState(37);
			match(VOID);
			setState(38);
			match(MAIN);
			setState(39);
			match(PA);
			setState(40);
			match(PC);
			setState(41);
			match(LA);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(42);
				accion();
				}
				}
				setState(47);
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
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CalculadoraParser.SEMI, 0); }
		public DeclaracionesContext(DeclaracionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitDeclaraciones(this);
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
			setState(48);
			type();
			setState(49);
			match(ID);
			setState(50);
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
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(CalculadoraParser.IGUAL, 0); }
		public TerminalNode SEMI() { return getToken(CalculadoraParser.SEMI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AsingsContext(AsingContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitAsings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsingContext asing() throws RecognitionException {
		AsingContext _localctx = new AsingContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_asing);
		int _la;
		try {
			_localctx = new AsingsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(IGUAL);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOTANTE) | (1L << PA) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(54);
				expr(0);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
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
			return getRuleContext(TypeContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(CalculadoraParser.ID, 0);
		}

		public TerminalNode IGUAL() {
			return getToken(CalculadoraParser.IGUAL, 0);
		}

		public TerminalNode SEMI() {
			return getToken(CalculadoraParser.SEMI, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public AsigdeclaracionContext(AsingmasdeclaraContext ctx) {
			copyFrom(ctx);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof CalculadoraVisitor)
				return ((CalculadoraVisitor<? extends T>) visitor).visitAsigdeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsingmasdeclaraContext asingmasdeclara() throws RecognitionException {
		AsingmasdeclaraContext _localctx = new AsingmasdeclaraContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asingmasdeclara);
		int _la;
		try {
			_localctx = new AsigdeclaracionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			type();
			setState(63);
			match(ID);
			setState(64);
			match(IGUAL);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOTANTE) | (1L << PA) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(65);
				expr(0);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		public TerminalNode ENTERO() { return getToken(CalculadoraParser.ENTERO, 0); }
		public TerminalNode FLOAT() { return getToken(CalculadoraParser.FLOAT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitType(this);
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
			setState(73);
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
		public TerminalNode PA() { return getToken(CalculadoraParser.PA, 0); }
		public TerminalNode PC() { return getToken(CalculadoraParser.PC, 0); }
		public TerminalNode SEMI() { return getToken(CalculadoraParser.SEMI, 0); }
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
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitImprime(this);
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
			setState(75);
			match(T__1);
			setState(76);
			match(PA);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOTANTE) | (1L << PA) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(77);
				expr(0);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(PC);
			setState(84);
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
		public TerminalNode PA() { return getToken(CalculadoraParser.PA, 0); }
		public TerminalNode CADENA() { return getToken(CalculadoraParser.CADENA, 0); }
		public TerminalNode PC() { return getToken(CalculadoraParser.PC, 0); }
		public TerminalNode SEMI() { return getToken(CalculadoraParser.SEMI, 0); }
		public Impr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impr2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitImpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Impr2Context impr2() throws RecognitionException {
		Impr2Context _localctx = new Impr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_impr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__1);
			setState(87);
			match(PA);
			setState(88);
			match(CADENA);
			setState(89);
			match(PC);
			setState(90);
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
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitAccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionContext accion() throws RecognitionException {
		AccionContext _localctx = new AccionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_accion);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				asing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				asingmasdeclara();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				condicionif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				imprime();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
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
		public TerminalNode POW() { return getToken(CalculadoraParser.POW, 0); }
		public PotenciaContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitPotencia(this);
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
		public TerminalNode POR() { return getToken(CalculadoraParser.POR, 0); }
		public TerminalNode DIV() { return getToken(CalculadoraParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentesissContext extends ExprContext {
		public TerminalNode PA() { return getToken(CalculadoraParser.PA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(CalculadoraParser.PC, 0); }
		public ParentesissContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitParentesiss(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(CalculadoraParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitId(this);
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
		public TerminalNode MAS() { return getToken(CalculadoraParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(CalculadoraParser.MENOS, 0); }
		public MasMenosContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitMasMenos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumsContext extends ExprContext {
		public TerminalNode INT() { return getToken(CalculadoraParser.INT, 0); }
		public TerminalNode FLOTANTE() { return getToken(CalculadoraParser.FLOTANTE, 0); }
		public NumsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitNums(this);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOTANTE:
			case INT:
				{
				_localctx = new NumsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101);
				_la = _input.LA(1);
				if ( !(_la==FLOTANTE || _la==INT) ) {
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
				setState(102);
				match(ID);
				}
				break;
			case PA:
				{
				_localctx = new ParentesissContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(PA);
				setState(104);
				expr(0);
				setState(105);
				match(PC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PotenciaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(110);
						match(POW);
						setState(111);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(113);
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
						setState(114);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new MasMenosContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(116);
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
						setState(117);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		public TerminalNode IGUALIGUAL() { return getToken(CalculadoraParser.IGUALIGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(CalculadoraParser.DIFERENTE, 0); }
		public IgualdifContext(Contenido_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitIgualdif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends Contenido_expContext {
		public TerminalNode TRUE() { return getToken(CalculadoraParser.TRUE, 0); }
		public TrueContext(Contenido_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends Contenido_expContext {
		public TerminalNode FALSE() { return getToken(CalculadoraParser.FALSE, 0); }
		public FalseContext(Contenido_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitFalse(this);
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
		public TerminalNode MAYOR_IGUAL() { return getToken(CalculadoraParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(CalculadoraParser.MENOR_IGUAL, 0); }
		public MayorigualmenorigualContext(Contenido_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitMayorigualmenorigual(this);
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
		public TerminalNode MAYOR() { return getToken(CalculadoraParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(CalculadoraParser.MENOR, 0); }
		public MayormenorContext(Contenido_expContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitMayormenor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Contenido_expContext contenido_exp() throws RecognitionException {
		Contenido_expContext _localctx = new Contenido_expContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_contenido_exp);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new MayormenorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				expr(0);
				setState(124);
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
				setState(125);
				expr(0);
				}
				break;
			case 2:
				_localctx = new MayorigualmenorigualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				expr(0);
				setState(128);
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
				setState(129);
				expr(0);
				}
				break;
			case 3:
				_localctx = new IgualdifContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				expr(0);
				setState(132);
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
				setState(133);
				expr(0);
				}
				break;
			case 4:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(FALSE);
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
	public static class AndsContext extends Condicion_logicalContext {
		public Token logic;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ANDAND() { return getToken(CalculadoraParser.ANDAND, 0); }
		public AndsContext(Condicion_logicalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitAnds(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrsContext extends Condicion_logicalContext {
		public Token logic;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OROR() { return getToken(CalculadoraParser.OROR, 0); }
		public OrsContext(Condicion_logicalContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitOrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicion_logicalContext condicion_logical() throws RecognitionException {
		Condicion_logicalContext _localctx = new Condicion_logicalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion_logical);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AndsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				expr(0);
				setState(140);
				((AndsContext)_localctx).logic = match(ANDAND);
				setState(141);
				expr(0);
				}
				break;
			case 2:
				_localctx = new OrsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				expr(0);
				setState(144);
				((OrsContext)_localctx).logic = match(OROR);
				setState(145);
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

	public static class CondicionesContext extends ParserRuleContext {
		public Contenido_expContext contenido_exp() {
			return getRuleContext(Contenido_expContext.class,0);
		}
		public Condicion_logicalContext condicion_logical() {
			return getRuleContext(Condicion_logicalContext.class,0);
		}
		public CondicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condiciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitCondiciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionesContext condiciones() throws RecognitionException {
		CondicionesContext _localctx = new CondicionesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condiciones);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				contenido_exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				condicion_logical();
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

	public static class CondicionifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CalculadoraParser.IF, 0); }
		public TerminalNode PA() { return getToken(CalculadoraParser.PA, 0); }
		public TerminalNode PC() { return getToken(CalculadoraParser.PC, 0); }
		public TerminalNode LA() { return getToken(CalculadoraParser.LA, 0); }
		public TerminalNode LC() { return getToken(CalculadoraParser.LC, 0); }
		public List<TerminalNode> ID() { return getTokens(CalculadoraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculadoraParser.ID, i);
		}
		public List<CondicionesContext> condiciones() {
			return getRuleContexts(CondicionesContext.class);
		}
		public CondicionesContext condiciones(int i) {
			return getRuleContext(CondicionesContext.class,i);
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
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitCondicionif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionifContext condicionif() throws RecognitionException {
		CondicionifContext _localctx = new CondicionifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condicionif);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IF);
			setState(154);
			match(PA);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOTANTE) | (1L << PA) | (1L << ID) | (1L << INT) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(155);
					match(ID);
					}
					break;
				case 2:
					{
					setState(156);
					condiciones();
					}
					break;
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(PC);
			setState(163);
			match(LA);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(164);
				accion();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			match(LC);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(171);
					c_elseif();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(177);
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
		public TerminalNode ELSE() { return getToken(CalculadoraParser.ELSE, 0); }
		public TerminalNode LA() { return getToken(CalculadoraParser.LA, 0); }
		public TerminalNode LC() { return getToken(CalculadoraParser.LC, 0); }

		public AccionContext accion(int i) {
			return getRuleContext(AccionContext.class,i);
		}
		public C_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitC_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_elseContext c_else() throws RecognitionException {
		C_elseContext _localctx = new C_elseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_c_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ELSE);
			setState(181);
			match(LA);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(182);
				accion();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
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
		public TerminalNode ELSE() { return getToken(CalculadoraParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(CalculadoraParser.IF, 0); }
		public TerminalNode PA() { return getToken(CalculadoraParser.PA, 0); }
		public TerminalNode PC() { return getToken(CalculadoraParser.PC, 0); }
		public TerminalNode LA() { return getToken(CalculadoraParser.LA, 0); }
		public TerminalNode LC() { return getToken(CalculadoraParser.LC, 0); }
		public List<TerminalNode> ID() { return getTokens(CalculadoraParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CalculadoraParser.ID, i);
		}
		public List<CondicionesContext> condiciones() {
			return getRuleContexts(CondicionesContext.class);
		}
		public CondicionesContext condiciones(int i) {
			return getRuleContext(CondicionesContext.class,i);
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
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitC_elseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_elseifContext c_elseif() throws RecognitionException {
		C_elseifContext _localctx = new C_elseifContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_c_elseif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ELSE);
			setState(191);
			match(IF);
			setState(192);
			match(PA);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FLOTANTE) | (1L << PA) | (1L << ID) | (1L << INT) | (1L << TRUE) | (1L << FALSE))) != 0)) {
				{
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(193);
					match(ID);
					}
					break;
				case 2:
					{
					setState(194);
					condiciones();
					}
					break;
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(PC);
			setState(201);
			match(LA);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(202);
				accion();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
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
		public TerminalNode FOR() { return getToken(CalculadoraParser.FOR, 0); }
		public TerminalNode PA() { return getToken(CalculadoraParser.PA, 0); }
		public TerminalNode LA() { return getToken(CalculadoraParser.LA, 0); }
		public List<AsingmasdeclaraContext> asingmasdeclara() {
			return getRuleContexts(AsingmasdeclaraContext.class);
		}
		public AsingmasdeclaraContext asingmasdeclara(int i) {
			return getRuleContext(AsingmasdeclaraContext.class,i);
		}
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
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(FOR);
			setState(211);
			match(PA);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTERO || _la==FLOAT) {
				{
				{
				setState(212);
				asingmasdeclara();
				}
				}
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			match(LA);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ENTERO) | (1L << FLOAT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(219);
				accion();
				}
				}
				setState(224);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6E\n\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\7\bQ\n\b\f\b\16\bT"+
		"\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"e\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13n\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13y\n\13\f\13\16\13|\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3\16\3\16\5\16\u009a\n\16\3\17\3\17\3\17"+
		"\3\17\7\17\u00a0\n\17\f\17\16\17\u00a3\13\17\3\17\3\17\3\17\7\17\u00a8"+
		"\n\17\f\17\16\17\u00ab\13\17\3\17\3\17\7\17\u00af\n\17\f\17\16\17\u00b2"+
		"\13\17\3\17\5\17\u00b5\n\17\3\20\3\20\3\20\7\20\u00ba\n\20\f\20\16\20"+
		"\u00bd\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00c6\n\21\f\21\16"+
		"\21\u00c9\13\21\3\21\3\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\7\22\u00d8\n\22\f\22\16\22\u00db\13\22\3\22"+
		"\3\22\7\22\u00df\n\22\f\22\16\22\u00e2\13\22\3\22\3\u00b0\3\24\23\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\t\3\2\22\23\4\2\7\7\"\"\3\2\n"+
		"\13\3\2\b\t\3\2\27\30\3\2\31\32\3\2\35\36\2\u00f1\2$\3\2\2\2\4&\3\2\2"+
		"\2\6\62\3\2\2\2\b\66\3\2\2\2\n@\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20X\3\2"+
		"\2\2\22d\3\2\2\2\24m\3\2\2\2\26\u008b\3\2\2\2\30\u0095\3\2\2\2\32\u0099"+
		"\3\2\2\2\34\u009b\3\2\2\2\36\u00b6\3\2\2\2 \u00c0\3\2\2\2\"\u00d4\3\2"+
		"\2\2$%\5\4\3\2%\3\3\2\2\2&\'\7\3\2\2\'(\7\5\2\2()\7\6\2\2)*\7\25\2\2*"+
		"+\7\26\2\2+/\7\37\2\2,.\5\22\n\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\5\3\2\2\2\61/\3\2\2\2\62\63\5\f\7\2\63\64\7!\2\2\64\65\7#\2"+
		"\2\65\7\3\2\2\2\66\67\7!\2\2\67;\7\f\2\28:\5\24\13\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7#\2\2?\t\3\2\2\2@A\5\f\7"+
		"\2AB\7!\2\2BF\7\f\2\2CE\5\24\13\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2GI\3\2\2\2HF\3\2\2\2IJ\7#\2\2J\13\3\2\2\2KL\t\2\2\2L\r\3\2\2\2MN\7"+
		"\4\2\2NR\7\25\2\2OQ\5\24\13\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2"+
		"SU\3\2\2\2TR\3\2\2\2UV\7\26\2\2VW\7#\2\2W\17\3\2\2\2XY\7\4\2\2YZ\7\25"+
		"\2\2Z[\7\r\2\2[\\\7\26\2\2\\]\7#\2\2]\21\3\2\2\2^e\5\b\5\2_e\5\6\4\2`"+
		"e\5\n\6\2ae\5\34\17\2be\5\16\b\2ce\5\20\t\2d^\3\2\2\2d_\3\2\2\2d`\3\2"+
		"\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fg\b\13\1\2gn\t\3\2\2hn"+
		"\7!\2\2ij\7\25\2\2jk\5\24\13\2kl\7\26\2\2ln\3\2\2\2mf\3\2\2\2mh\3\2\2"+
		"\2mi\3\2\2\2nz\3\2\2\2op\f\b\2\2pq\7\24\2\2qy\5\24\13\trs\f\7\2\2st\t"+
		"\4\2\2ty\5\24\13\buv\f\6\2\2vw\t\5\2\2wy\5\24\13\7xo\3\2\2\2xr\3\2\2\2"+
		"xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\25\3\2\2\2|z\3\2\2\2}~\5\24"+
		"\13\2~\177\t\6\2\2\177\u0080\5\24\13\2\u0080\u008c\3\2\2\2\u0081\u0082"+
		"\5\24\13\2\u0082\u0083\t\7\2\2\u0083\u0084\5\24\13\2\u0084\u008c\3\2\2"+
		"\2\u0085\u0086\5\24\13\2\u0086\u0087\t\b\2\2\u0087\u0088\5\24\13\2\u0088"+
		"\u008c\3\2\2\2\u0089\u008c\7&\2\2\u008a\u008c\7\'\2\2\u008b}\3\2\2\2\u008b"+
		"\u0081\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2"+
		"\2\2\u008c\27\3\2\2\2\u008d\u008e\5\24\13\2\u008e\u008f\7\20\2\2\u008f"+
		"\u0090\5\24\13\2\u0090\u0096\3\2\2\2\u0091\u0092\5\24\13\2\u0092\u0093"+
		"\7\21\2\2\u0093\u0094\5\24\13\2\u0094\u0096\3\2\2\2\u0095\u008d\3\2\2"+
		"\2\u0095\u0091\3\2\2\2\u0096\31\3\2\2\2\u0097\u009a\5\26\f\2\u0098\u009a"+
		"\5\30\r\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\33\3\2\2\2\u009b"+
		"\u009c\7\33\2\2\u009c\u00a1\7\25\2\2\u009d\u00a0\7!\2\2\u009e\u00a0\5"+
		"\32\16\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a5\7\26\2\2\u00a5\u00a9\7\37\2\2\u00a6\u00a8\5\22\n\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00b0\7 \2\2\u00ad"+
		"\u00af\5 \21\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b5\5\36\20\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\35\3\2"+
		"\2\2\u00b6\u00b7\7\34\2\2\u00b7\u00bb\7\37\2\2\u00b8\u00ba\5\22\n\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7 \2\2\u00bf"+
		"\37\3\2\2\2\u00c0\u00c1\7\34\2\2\u00c1\u00c2\7\33\2\2\u00c2\u00c7\7\25"+
		"\2\2\u00c3\u00c6\7!\2\2\u00c4\u00c6\5\32\16\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\26\2\2\u00cb"+
		"\u00cf\7\37\2\2\u00cc\u00ce\5\22\n\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7 \2\2\u00d3!\3\2\2\2\u00d4\u00d5\7%\2\2\u00d5"+
		"\u00d9\7\25\2\2\u00d6\u00d8\5\n\6\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3"+
		"\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00dc\u00e0\7\37\2\2\u00dd\u00df\5\22\n\2\u00de\u00dd\3"+
		"\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"#\3\2\2\2\u00e2\u00e0\3\2\2\2\30/;FRdmxz\u008b\u0095\u0099\u009f\u00a1"+
		"\u00a9\u00b0\u00b4\u00bb\u00c5\u00c7\u00cf\u00d9\u00e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}