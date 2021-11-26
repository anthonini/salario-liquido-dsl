package br.ufrn.ppgti.ppgti1007.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import br.ufrn.ppgti.ppgti1007.services.SalarioLiquidoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSalarioLiquidoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Salario'", "'Dependentes'", "'Descontos'", "'Previdencia'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSalarioLiquidoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSalarioLiquidoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSalarioLiquidoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSalarioLiquido.g"; }


    	private SalarioLiquidoGrammarAccess grammarAccess;

    	public void setGrammarAccess(SalarioLiquidoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSalarios"
    // InternalSalarioLiquido.g:53:1: entryRuleSalarios : ruleSalarios EOF ;
    public final void entryRuleSalarios() throws RecognitionException {
        try {
            // InternalSalarioLiquido.g:54:1: ( ruleSalarios EOF )
            // InternalSalarioLiquido.g:55:1: ruleSalarios EOF
            {
             before(grammarAccess.getSalariosRule()); 
            pushFollow(FOLLOW_1);
            ruleSalarios();

            state._fsp--;

             after(grammarAccess.getSalariosRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSalarios"


    // $ANTLR start "ruleSalarios"
    // InternalSalarioLiquido.g:62:1: ruleSalarios : ( ( rule__Salarios__SalariosAssignment )* ) ;
    public final void ruleSalarios() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:66:2: ( ( ( rule__Salarios__SalariosAssignment )* ) )
            // InternalSalarioLiquido.g:67:2: ( ( rule__Salarios__SalariosAssignment )* )
            {
            // InternalSalarioLiquido.g:67:2: ( ( rule__Salarios__SalariosAssignment )* )
            // InternalSalarioLiquido.g:68:3: ( rule__Salarios__SalariosAssignment )*
            {
             before(grammarAccess.getSalariosAccess().getSalariosAssignment()); 
            // InternalSalarioLiquido.g:69:3: ( rule__Salarios__SalariosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSalarioLiquido.g:69:4: rule__Salarios__SalariosAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Salarios__SalariosAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSalariosAccess().getSalariosAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSalarios"


    // $ANTLR start "entryRuleSalario"
    // InternalSalarioLiquido.g:78:1: entryRuleSalario : ruleSalario EOF ;
    public final void entryRuleSalario() throws RecognitionException {
        try {
            // InternalSalarioLiquido.g:79:1: ( ruleSalario EOF )
            // InternalSalarioLiquido.g:80:1: ruleSalario EOF
            {
             before(grammarAccess.getSalarioRule()); 
            pushFollow(FOLLOW_1);
            ruleSalario();

            state._fsp--;

             after(grammarAccess.getSalarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSalario"


    // $ANTLR start "ruleSalario"
    // InternalSalarioLiquido.g:87:1: ruleSalario : ( ( rule__Salario__Group__0 ) ) ;
    public final void ruleSalario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:91:2: ( ( ( rule__Salario__Group__0 ) ) )
            // InternalSalarioLiquido.g:92:2: ( ( rule__Salario__Group__0 ) )
            {
            // InternalSalarioLiquido.g:92:2: ( ( rule__Salario__Group__0 ) )
            // InternalSalarioLiquido.g:93:3: ( rule__Salario__Group__0 )
            {
             before(grammarAccess.getSalarioAccess().getGroup()); 
            // InternalSalarioLiquido.g:94:3: ( rule__Salario__Group__0 )
            // InternalSalarioLiquido.g:94:4: rule__Salario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Salario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSalarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSalario"


    // $ANTLR start "entryRuleDouble"
    // InternalSalarioLiquido.g:103:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalSalarioLiquido.g:104:1: ( ruleDouble EOF )
            // InternalSalarioLiquido.g:105:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalSalarioLiquido.g:112:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:116:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalSalarioLiquido.g:117:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalSalarioLiquido.g:117:2: ( ( rule__Double__Group__0 ) )
            // InternalSalarioLiquido.g:118:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalSalarioLiquido.g:119:3: ( rule__Double__Group__0 )
            // InternalSalarioLiquido.g:119:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "rule__Salario__Group__0"
    // InternalSalarioLiquido.g:127:1: rule__Salario__Group__0 : rule__Salario__Group__0__Impl rule__Salario__Group__1 ;
    public final void rule__Salario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:131:1: ( rule__Salario__Group__0__Impl rule__Salario__Group__1 )
            // InternalSalarioLiquido.g:132:2: rule__Salario__Group__0__Impl rule__Salario__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Salario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Salario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__0"


    // $ANTLR start "rule__Salario__Group__0__Impl"
    // InternalSalarioLiquido.g:139:1: rule__Salario__Group__0__Impl : ( 'Salario' ) ;
    public final void rule__Salario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:143:1: ( ( 'Salario' ) )
            // InternalSalarioLiquido.g:144:1: ( 'Salario' )
            {
            // InternalSalarioLiquido.g:144:1: ( 'Salario' )
            // InternalSalarioLiquido.g:145:2: 'Salario'
            {
             before(grammarAccess.getSalarioAccess().getSalarioKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSalarioAccess().getSalarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__0__Impl"


    // $ANTLR start "rule__Salario__Group__1"
    // InternalSalarioLiquido.g:154:1: rule__Salario__Group__1 : rule__Salario__Group__1__Impl rule__Salario__Group__2 ;
    public final void rule__Salario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:158:1: ( rule__Salario__Group__1__Impl rule__Salario__Group__2 )
            // InternalSalarioLiquido.g:159:2: rule__Salario__Group__1__Impl rule__Salario__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Salario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Salario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__1"


    // $ANTLR start "rule__Salario__Group__1__Impl"
    // InternalSalarioLiquido.g:166:1: rule__Salario__Group__1__Impl : ( ( rule__Salario__ValorAssignment_1 ) ) ;
    public final void rule__Salario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:170:1: ( ( ( rule__Salario__ValorAssignment_1 ) ) )
            // InternalSalarioLiquido.g:171:1: ( ( rule__Salario__ValorAssignment_1 ) )
            {
            // InternalSalarioLiquido.g:171:1: ( ( rule__Salario__ValorAssignment_1 ) )
            // InternalSalarioLiquido.g:172:2: ( rule__Salario__ValorAssignment_1 )
            {
             before(grammarAccess.getSalarioAccess().getValorAssignment_1()); 
            // InternalSalarioLiquido.g:173:2: ( rule__Salario__ValorAssignment_1 )
            // InternalSalarioLiquido.g:173:3: rule__Salario__ValorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Salario__ValorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSalarioAccess().getValorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__1__Impl"


    // $ANTLR start "rule__Salario__Group__2"
    // InternalSalarioLiquido.g:181:1: rule__Salario__Group__2 : rule__Salario__Group__2__Impl rule__Salario__Group__3 ;
    public final void rule__Salario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:185:1: ( rule__Salario__Group__2__Impl rule__Salario__Group__3 )
            // InternalSalarioLiquido.g:186:2: rule__Salario__Group__2__Impl rule__Salario__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Salario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Salario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__2"


    // $ANTLR start "rule__Salario__Group__2__Impl"
    // InternalSalarioLiquido.g:193:1: rule__Salario__Group__2__Impl : ( ( rule__Salario__Group_2__0 )? ) ;
    public final void rule__Salario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:197:1: ( ( ( rule__Salario__Group_2__0 )? ) )
            // InternalSalarioLiquido.g:198:1: ( ( rule__Salario__Group_2__0 )? )
            {
            // InternalSalarioLiquido.g:198:1: ( ( rule__Salario__Group_2__0 )? )
            // InternalSalarioLiquido.g:199:2: ( rule__Salario__Group_2__0 )?
            {
             before(grammarAccess.getSalarioAccess().getGroup_2()); 
            // InternalSalarioLiquido.g:200:2: ( rule__Salario__Group_2__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSalarioLiquido.g:200:3: rule__Salario__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Salario__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSalarioAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__2__Impl"


    // $ANTLR start "rule__Salario__Group__3"
    // InternalSalarioLiquido.g:208:1: rule__Salario__Group__3 : rule__Salario__Group__3__Impl rule__Salario__Group__4 ;
    public final void rule__Salario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:212:1: ( rule__Salario__Group__3__Impl rule__Salario__Group__4 )
            // InternalSalarioLiquido.g:213:2: rule__Salario__Group__3__Impl rule__Salario__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Salario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Salario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__3"


    // $ANTLR start "rule__Salario__Group__3__Impl"
    // InternalSalarioLiquido.g:220:1: rule__Salario__Group__3__Impl : ( ( rule__Salario__Group_3__0 )? ) ;
    public final void rule__Salario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:224:1: ( ( ( rule__Salario__Group_3__0 )? ) )
            // InternalSalarioLiquido.g:225:1: ( ( rule__Salario__Group_3__0 )? )
            {
            // InternalSalarioLiquido.g:225:1: ( ( rule__Salario__Group_3__0 )? )
            // InternalSalarioLiquido.g:226:2: ( rule__Salario__Group_3__0 )?
            {
             before(grammarAccess.getSalarioAccess().getGroup_3()); 
            // InternalSalarioLiquido.g:227:2: ( rule__Salario__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSalarioLiquido.g:227:3: rule__Salario__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Salario__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSalarioAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__3__Impl"


    // $ANTLR start "rule__Salario__Group__4"
    // InternalSalarioLiquido.g:235:1: rule__Salario__Group__4 : rule__Salario__Group__4__Impl ;
    public final void rule__Salario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:239:1: ( rule__Salario__Group__4__Impl )
            // InternalSalarioLiquido.g:240:2: rule__Salario__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Salario__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__4"


    // $ANTLR start "rule__Salario__Group__4__Impl"
    // InternalSalarioLiquido.g:246:1: rule__Salario__Group__4__Impl : ( ( rule__Salario__Group_4__0 )? ) ;
    public final void rule__Salario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:250:1: ( ( ( rule__Salario__Group_4__0 )? ) )
            // InternalSalarioLiquido.g:251:1: ( ( rule__Salario__Group_4__0 )? )
            {
            // InternalSalarioLiquido.g:251:1: ( ( rule__Salario__Group_4__0 )? )
            // InternalSalarioLiquido.g:252:2: ( rule__Salario__Group_4__0 )?
            {
             before(grammarAccess.getSalarioAccess().getGroup_4()); 
            // InternalSalarioLiquido.g:253:2: ( rule__Salario__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSalarioLiquido.g:253:3: rule__Salario__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Salario__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSalarioAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group__4__Impl"


    // $ANTLR start "rule__Salario__Group_2__0"
    // InternalSalarioLiquido.g:262:1: rule__Salario__Group_2__0 : rule__Salario__Group_2__0__Impl rule__Salario__Group_2__1 ;
    public final void rule__Salario__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:266:1: ( rule__Salario__Group_2__0__Impl rule__Salario__Group_2__1 )
            // InternalSalarioLiquido.g:267:2: rule__Salario__Group_2__0__Impl rule__Salario__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Salario__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Salario__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_2__0"


    // $ANTLR start "rule__Salario__Group_2__0__Impl"
    // InternalSalarioLiquido.g:274:1: rule__Salario__Group_2__0__Impl : ( 'Dependentes' ) ;
    public final void rule__Salario__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:278:1: ( ( 'Dependentes' ) )
            // InternalSalarioLiquido.g:279:1: ( 'Dependentes' )
            {
            // InternalSalarioLiquido.g:279:1: ( 'Dependentes' )
            // InternalSalarioLiquido.g:280:2: 'Dependentes'
            {
             before(grammarAccess.getSalarioAccess().getDependentesKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSalarioAccess().getDependentesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_2__0__Impl"


    // $ANTLR start "rule__Salario__Group_2__1"
    // InternalSalarioLiquido.g:289:1: rule__Salario__Group_2__1 : rule__Salario__Group_2__1__Impl ;
    public final void rule__Salario__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:293:1: ( rule__Salario__Group_2__1__Impl )
            // InternalSalarioLiquido.g:294:2: rule__Salario__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Salario__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_2__1"


    // $ANTLR start "rule__Salario__Group_2__1__Impl"
    // InternalSalarioLiquido.g:300:1: rule__Salario__Group_2__1__Impl : ( ( rule__Salario__DependentesAssignment_2_1 ) ) ;
    public final void rule__Salario__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:304:1: ( ( ( rule__Salario__DependentesAssignment_2_1 ) ) )
            // InternalSalarioLiquido.g:305:1: ( ( rule__Salario__DependentesAssignment_2_1 ) )
            {
            // InternalSalarioLiquido.g:305:1: ( ( rule__Salario__DependentesAssignment_2_1 ) )
            // InternalSalarioLiquido.g:306:2: ( rule__Salario__DependentesAssignment_2_1 )
            {
             before(grammarAccess.getSalarioAccess().getDependentesAssignment_2_1()); 
            // InternalSalarioLiquido.g:307:2: ( rule__Salario__DependentesAssignment_2_1 )
            // InternalSalarioLiquido.g:307:3: rule__Salario__DependentesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Salario__DependentesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSalarioAccess().getDependentesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_2__1__Impl"


    // $ANTLR start "rule__Salario__Group_3__0"
    // InternalSalarioLiquido.g:316:1: rule__Salario__Group_3__0 : rule__Salario__Group_3__0__Impl rule__Salario__Group_3__1 ;
    public final void rule__Salario__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:320:1: ( rule__Salario__Group_3__0__Impl rule__Salario__Group_3__1 )
            // InternalSalarioLiquido.g:321:2: rule__Salario__Group_3__0__Impl rule__Salario__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Salario__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Salario__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_3__0"


    // $ANTLR start "rule__Salario__Group_3__0__Impl"
    // InternalSalarioLiquido.g:328:1: rule__Salario__Group_3__0__Impl : ( 'Descontos' ) ;
    public final void rule__Salario__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:332:1: ( ( 'Descontos' ) )
            // InternalSalarioLiquido.g:333:1: ( 'Descontos' )
            {
            // InternalSalarioLiquido.g:333:1: ( 'Descontos' )
            // InternalSalarioLiquido.g:334:2: 'Descontos'
            {
             before(grammarAccess.getSalarioAccess().getDescontosKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSalarioAccess().getDescontosKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_3__0__Impl"


    // $ANTLR start "rule__Salario__Group_3__1"
    // InternalSalarioLiquido.g:343:1: rule__Salario__Group_3__1 : rule__Salario__Group_3__1__Impl ;
    public final void rule__Salario__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:347:1: ( rule__Salario__Group_3__1__Impl )
            // InternalSalarioLiquido.g:348:2: rule__Salario__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Salario__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_3__1"


    // $ANTLR start "rule__Salario__Group_3__1__Impl"
    // InternalSalarioLiquido.g:354:1: rule__Salario__Group_3__1__Impl : ( ( rule__Salario__DescontosAssignment_3_1 ) ) ;
    public final void rule__Salario__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:358:1: ( ( ( rule__Salario__DescontosAssignment_3_1 ) ) )
            // InternalSalarioLiquido.g:359:1: ( ( rule__Salario__DescontosAssignment_3_1 ) )
            {
            // InternalSalarioLiquido.g:359:1: ( ( rule__Salario__DescontosAssignment_3_1 ) )
            // InternalSalarioLiquido.g:360:2: ( rule__Salario__DescontosAssignment_3_1 )
            {
             before(grammarAccess.getSalarioAccess().getDescontosAssignment_3_1()); 
            // InternalSalarioLiquido.g:361:2: ( rule__Salario__DescontosAssignment_3_1 )
            // InternalSalarioLiquido.g:361:3: rule__Salario__DescontosAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Salario__DescontosAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSalarioAccess().getDescontosAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_3__1__Impl"


    // $ANTLR start "rule__Salario__Group_4__0"
    // InternalSalarioLiquido.g:370:1: rule__Salario__Group_4__0 : rule__Salario__Group_4__0__Impl rule__Salario__Group_4__1 ;
    public final void rule__Salario__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:374:1: ( rule__Salario__Group_4__0__Impl rule__Salario__Group_4__1 )
            // InternalSalarioLiquido.g:375:2: rule__Salario__Group_4__0__Impl rule__Salario__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Salario__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Salario__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_4__0"


    // $ANTLR start "rule__Salario__Group_4__0__Impl"
    // InternalSalarioLiquido.g:382:1: rule__Salario__Group_4__0__Impl : ( 'Previdencia' ) ;
    public final void rule__Salario__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:386:1: ( ( 'Previdencia' ) )
            // InternalSalarioLiquido.g:387:1: ( 'Previdencia' )
            {
            // InternalSalarioLiquido.g:387:1: ( 'Previdencia' )
            // InternalSalarioLiquido.g:388:2: 'Previdencia'
            {
             before(grammarAccess.getSalarioAccess().getPrevidenciaKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSalarioAccess().getPrevidenciaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_4__0__Impl"


    // $ANTLR start "rule__Salario__Group_4__1"
    // InternalSalarioLiquido.g:397:1: rule__Salario__Group_4__1 : rule__Salario__Group_4__1__Impl ;
    public final void rule__Salario__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:401:1: ( rule__Salario__Group_4__1__Impl )
            // InternalSalarioLiquido.g:402:2: rule__Salario__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Salario__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_4__1"


    // $ANTLR start "rule__Salario__Group_4__1__Impl"
    // InternalSalarioLiquido.g:408:1: rule__Salario__Group_4__1__Impl : ( ( rule__Salario__PrevidenciaAssignment_4_1 ) ) ;
    public final void rule__Salario__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:412:1: ( ( ( rule__Salario__PrevidenciaAssignment_4_1 ) ) )
            // InternalSalarioLiquido.g:413:1: ( ( rule__Salario__PrevidenciaAssignment_4_1 ) )
            {
            // InternalSalarioLiquido.g:413:1: ( ( rule__Salario__PrevidenciaAssignment_4_1 ) )
            // InternalSalarioLiquido.g:414:2: ( rule__Salario__PrevidenciaAssignment_4_1 )
            {
             before(grammarAccess.getSalarioAccess().getPrevidenciaAssignment_4_1()); 
            // InternalSalarioLiquido.g:415:2: ( rule__Salario__PrevidenciaAssignment_4_1 )
            // InternalSalarioLiquido.g:415:3: rule__Salario__PrevidenciaAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Salario__PrevidenciaAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSalarioAccess().getPrevidenciaAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__Group_4__1__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalSalarioLiquido.g:424:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:428:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalSalarioLiquido.g:429:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalSalarioLiquido.g:436:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:440:1: ( ( RULE_INT ) )
            // InternalSalarioLiquido.g:441:1: ( RULE_INT )
            {
            // InternalSalarioLiquido.g:441:1: ( RULE_INT )
            // InternalSalarioLiquido.g:442:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalSalarioLiquido.g:451:1: rule__Double__Group__1 : rule__Double__Group__1__Impl ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:455:1: ( rule__Double__Group__1__Impl )
            // InternalSalarioLiquido.g:456:2: rule__Double__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalSalarioLiquido.g:462:1: rule__Double__Group__1__Impl : ( ( rule__Double__Group_1__0 )? ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:466:1: ( ( ( rule__Double__Group_1__0 )? ) )
            // InternalSalarioLiquido.g:467:1: ( ( rule__Double__Group_1__0 )? )
            {
            // InternalSalarioLiquido.g:467:1: ( ( rule__Double__Group_1__0 )? )
            // InternalSalarioLiquido.g:468:2: ( rule__Double__Group_1__0 )?
            {
             before(grammarAccess.getDoubleAccess().getGroup_1()); 
            // InternalSalarioLiquido.g:469:2: ( rule__Double__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSalarioLiquido.g:469:3: rule__Double__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Double__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group_1__0"
    // InternalSalarioLiquido.g:478:1: rule__Double__Group_1__0 : rule__Double__Group_1__0__Impl rule__Double__Group_1__1 ;
    public final void rule__Double__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:482:1: ( rule__Double__Group_1__0__Impl rule__Double__Group_1__1 )
            // InternalSalarioLiquido.g:483:2: rule__Double__Group_1__0__Impl rule__Double__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Double__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group_1__0"


    // $ANTLR start "rule__Double__Group_1__0__Impl"
    // InternalSalarioLiquido.g:490:1: rule__Double__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Double__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:494:1: ( ( '.' ) )
            // InternalSalarioLiquido.g:495:1: ( '.' )
            {
            // InternalSalarioLiquido.g:495:1: ( '.' )
            // InternalSalarioLiquido.g:496:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group_1__0__Impl"


    // $ANTLR start "rule__Double__Group_1__1"
    // InternalSalarioLiquido.g:505:1: rule__Double__Group_1__1 : rule__Double__Group_1__1__Impl ;
    public final void rule__Double__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:509:1: ( rule__Double__Group_1__1__Impl )
            // InternalSalarioLiquido.g:510:2: rule__Double__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group_1__1"


    // $ANTLR start "rule__Double__Group_1__1__Impl"
    // InternalSalarioLiquido.g:516:1: rule__Double__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:520:1: ( ( RULE_INT ) )
            // InternalSalarioLiquido.g:521:1: ( RULE_INT )
            {
            // InternalSalarioLiquido.g:521:1: ( RULE_INT )
            // InternalSalarioLiquido.g:522:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group_1__1__Impl"


    // $ANTLR start "rule__Salarios__SalariosAssignment"
    // InternalSalarioLiquido.g:532:1: rule__Salarios__SalariosAssignment : ( ruleSalario ) ;
    public final void rule__Salarios__SalariosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:536:1: ( ( ruleSalario ) )
            // InternalSalarioLiquido.g:537:2: ( ruleSalario )
            {
            // InternalSalarioLiquido.g:537:2: ( ruleSalario )
            // InternalSalarioLiquido.g:538:3: ruleSalario
            {
             before(grammarAccess.getSalariosAccess().getSalariosSalarioParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSalario();

            state._fsp--;

             after(grammarAccess.getSalariosAccess().getSalariosSalarioParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salarios__SalariosAssignment"


    // $ANTLR start "rule__Salario__ValorAssignment_1"
    // InternalSalarioLiquido.g:547:1: rule__Salario__ValorAssignment_1 : ( ruleDouble ) ;
    public final void rule__Salario__ValorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:551:1: ( ( ruleDouble ) )
            // InternalSalarioLiquido.g:552:2: ( ruleDouble )
            {
            // InternalSalarioLiquido.g:552:2: ( ruleDouble )
            // InternalSalarioLiquido.g:553:3: ruleDouble
            {
             before(grammarAccess.getSalarioAccess().getValorDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getSalarioAccess().getValorDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__ValorAssignment_1"


    // $ANTLR start "rule__Salario__DependentesAssignment_2_1"
    // InternalSalarioLiquido.g:562:1: rule__Salario__DependentesAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Salario__DependentesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:566:1: ( ( RULE_INT ) )
            // InternalSalarioLiquido.g:567:2: ( RULE_INT )
            {
            // InternalSalarioLiquido.g:567:2: ( RULE_INT )
            // InternalSalarioLiquido.g:568:3: RULE_INT
            {
             before(grammarAccess.getSalarioAccess().getDependentesINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSalarioAccess().getDependentesINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__DependentesAssignment_2_1"


    // $ANTLR start "rule__Salario__DescontosAssignment_3_1"
    // InternalSalarioLiquido.g:577:1: rule__Salario__DescontosAssignment_3_1 : ( ruleDouble ) ;
    public final void rule__Salario__DescontosAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:581:1: ( ( ruleDouble ) )
            // InternalSalarioLiquido.g:582:2: ( ruleDouble )
            {
            // InternalSalarioLiquido.g:582:2: ( ruleDouble )
            // InternalSalarioLiquido.g:583:3: ruleDouble
            {
             before(grammarAccess.getSalarioAccess().getDescontosDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getSalarioAccess().getDescontosDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__DescontosAssignment_3_1"


    // $ANTLR start "rule__Salario__PrevidenciaAssignment_4_1"
    // InternalSalarioLiquido.g:592:1: rule__Salario__PrevidenciaAssignment_4_1 : ( ruleDouble ) ;
    public final void rule__Salario__PrevidenciaAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSalarioLiquido.g:596:1: ( ( ruleDouble ) )
            // InternalSalarioLiquido.g:597:2: ( ruleDouble )
            {
            // InternalSalarioLiquido.g:597:2: ( ruleDouble )
            // InternalSalarioLiquido.g:598:3: ruleDouble
            {
             before(grammarAccess.getSalarioAccess().getPrevidenciaDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getSalarioAccess().getPrevidenciaDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Salario__PrevidenciaAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});

}