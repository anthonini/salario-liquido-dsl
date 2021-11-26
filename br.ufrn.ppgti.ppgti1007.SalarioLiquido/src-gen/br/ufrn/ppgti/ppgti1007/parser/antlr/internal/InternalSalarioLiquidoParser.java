package br.ufrn.ppgti.ppgti1007.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufrn.ppgti.ppgti1007.services.SalarioLiquidoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSalarioLiquidoParser extends AbstractInternalAntlrParser {
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

        public InternalSalarioLiquidoParser(TokenStream input, SalarioLiquidoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Salarios";
       	}

       	@Override
       	protected SalarioLiquidoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSalarios"
    // InternalSalarioLiquido.g:64:1: entryRuleSalarios returns [EObject current=null] : iv_ruleSalarios= ruleSalarios EOF ;
    public final EObject entryRuleSalarios() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSalarios = null;


        try {
            // InternalSalarioLiquido.g:64:49: (iv_ruleSalarios= ruleSalarios EOF )
            // InternalSalarioLiquido.g:65:2: iv_ruleSalarios= ruleSalarios EOF
            {
             newCompositeNode(grammarAccess.getSalariosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSalarios=ruleSalarios();

            state._fsp--;

             current =iv_ruleSalarios; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSalarios"


    // $ANTLR start "ruleSalarios"
    // InternalSalarioLiquido.g:71:1: ruleSalarios returns [EObject current=null] : ( (lv_salarios_0_0= ruleSalario ) )* ;
    public final EObject ruleSalarios() throws RecognitionException {
        EObject current = null;

        EObject lv_salarios_0_0 = null;



        	enterRule();

        try {
            // InternalSalarioLiquido.g:77:2: ( ( (lv_salarios_0_0= ruleSalario ) )* )
            // InternalSalarioLiquido.g:78:2: ( (lv_salarios_0_0= ruleSalario ) )*
            {
            // InternalSalarioLiquido.g:78:2: ( (lv_salarios_0_0= ruleSalario ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSalarioLiquido.g:79:3: (lv_salarios_0_0= ruleSalario )
            	    {
            	    // InternalSalarioLiquido.g:79:3: (lv_salarios_0_0= ruleSalario )
            	    // InternalSalarioLiquido.g:80:4: lv_salarios_0_0= ruleSalario
            	    {

            	    				newCompositeNode(grammarAccess.getSalariosAccess().getSalariosSalarioParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_salarios_0_0=ruleSalario();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getSalariosRule());
            	    				}
            	    				add(
            	    					current,
            	    					"salarios",
            	    					lv_salarios_0_0,
            	    					"br.ufrn.ppgti.ppgti1007.SalarioLiquido.Salario");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSalarios"


    // $ANTLR start "entryRuleSalario"
    // InternalSalarioLiquido.g:100:1: entryRuleSalario returns [EObject current=null] : iv_ruleSalario= ruleSalario EOF ;
    public final EObject entryRuleSalario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSalario = null;


        try {
            // InternalSalarioLiquido.g:100:48: (iv_ruleSalario= ruleSalario EOF )
            // InternalSalarioLiquido.g:101:2: iv_ruleSalario= ruleSalario EOF
            {
             newCompositeNode(grammarAccess.getSalarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSalario=ruleSalario();

            state._fsp--;

             current =iv_ruleSalario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSalario"


    // $ANTLR start "ruleSalario"
    // InternalSalarioLiquido.g:107:1: ruleSalario returns [EObject current=null] : (otherlv_0= 'Salario' ( (lv_valor_1_0= ruleDouble ) ) (otherlv_2= 'Dependentes' ( (lv_dependentes_3_0= RULE_INT ) ) )? (otherlv_4= 'Descontos' ( (lv_descontos_5_0= ruleDouble ) ) )? (otherlv_6= 'Previdencia' ( (lv_previdencia_7_0= ruleDouble ) ) )? ) ;
    public final EObject ruleSalario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_dependentes_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_valor_1_0 = null;

        AntlrDatatypeRuleToken lv_descontos_5_0 = null;

        AntlrDatatypeRuleToken lv_previdencia_7_0 = null;



        	enterRule();

        try {
            // InternalSalarioLiquido.g:113:2: ( (otherlv_0= 'Salario' ( (lv_valor_1_0= ruleDouble ) ) (otherlv_2= 'Dependentes' ( (lv_dependentes_3_0= RULE_INT ) ) )? (otherlv_4= 'Descontos' ( (lv_descontos_5_0= ruleDouble ) ) )? (otherlv_6= 'Previdencia' ( (lv_previdencia_7_0= ruleDouble ) ) )? ) )
            // InternalSalarioLiquido.g:114:2: (otherlv_0= 'Salario' ( (lv_valor_1_0= ruleDouble ) ) (otherlv_2= 'Dependentes' ( (lv_dependentes_3_0= RULE_INT ) ) )? (otherlv_4= 'Descontos' ( (lv_descontos_5_0= ruleDouble ) ) )? (otherlv_6= 'Previdencia' ( (lv_previdencia_7_0= ruleDouble ) ) )? )
            {
            // InternalSalarioLiquido.g:114:2: (otherlv_0= 'Salario' ( (lv_valor_1_0= ruleDouble ) ) (otherlv_2= 'Dependentes' ( (lv_dependentes_3_0= RULE_INT ) ) )? (otherlv_4= 'Descontos' ( (lv_descontos_5_0= ruleDouble ) ) )? (otherlv_6= 'Previdencia' ( (lv_previdencia_7_0= ruleDouble ) ) )? )
            // InternalSalarioLiquido.g:115:3: otherlv_0= 'Salario' ( (lv_valor_1_0= ruleDouble ) ) (otherlv_2= 'Dependentes' ( (lv_dependentes_3_0= RULE_INT ) ) )? (otherlv_4= 'Descontos' ( (lv_descontos_5_0= ruleDouble ) ) )? (otherlv_6= 'Previdencia' ( (lv_previdencia_7_0= ruleDouble ) ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSalarioAccess().getSalarioKeyword_0());
            		
            // InternalSalarioLiquido.g:119:3: ( (lv_valor_1_0= ruleDouble ) )
            // InternalSalarioLiquido.g:120:4: (lv_valor_1_0= ruleDouble )
            {
            // InternalSalarioLiquido.g:120:4: (lv_valor_1_0= ruleDouble )
            // InternalSalarioLiquido.g:121:5: lv_valor_1_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getSalarioAccess().getValorDoubleParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_valor_1_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSalarioRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_1_0,
            						"br.ufrn.ppgti.ppgti1007.SalarioLiquido.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSalarioLiquido.g:138:3: (otherlv_2= 'Dependentes' ( (lv_dependentes_3_0= RULE_INT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSalarioLiquido.g:139:4: otherlv_2= 'Dependentes' ( (lv_dependentes_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getSalarioAccess().getDependentesKeyword_2_0());
                    			
                    // InternalSalarioLiquido.g:143:4: ( (lv_dependentes_3_0= RULE_INT ) )
                    // InternalSalarioLiquido.g:144:5: (lv_dependentes_3_0= RULE_INT )
                    {
                    // InternalSalarioLiquido.g:144:5: (lv_dependentes_3_0= RULE_INT )
                    // InternalSalarioLiquido.g:145:6: lv_dependentes_3_0= RULE_INT
                    {
                    lv_dependentes_3_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    						newLeafNode(lv_dependentes_3_0, grammarAccess.getSalarioAccess().getDependentesINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSalarioRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dependentes",
                    							lv_dependentes_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalarioLiquido.g:162:3: (otherlv_4= 'Descontos' ( (lv_descontos_5_0= ruleDouble ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSalarioLiquido.g:163:4: otherlv_4= 'Descontos' ( (lv_descontos_5_0= ruleDouble ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSalarioAccess().getDescontosKeyword_3_0());
                    			
                    // InternalSalarioLiquido.g:167:4: ( (lv_descontos_5_0= ruleDouble ) )
                    // InternalSalarioLiquido.g:168:5: (lv_descontos_5_0= ruleDouble )
                    {
                    // InternalSalarioLiquido.g:168:5: (lv_descontos_5_0= ruleDouble )
                    // InternalSalarioLiquido.g:169:6: lv_descontos_5_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getSalarioAccess().getDescontosDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_descontos_5_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSalarioRule());
                    						}
                    						set(
                    							current,
                    							"descontos",
                    							lv_descontos_5_0,
                    							"br.ufrn.ppgti.ppgti1007.SalarioLiquido.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSalarioLiquido.g:187:3: (otherlv_6= 'Previdencia' ( (lv_previdencia_7_0= ruleDouble ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSalarioLiquido.g:188:4: otherlv_6= 'Previdencia' ( (lv_previdencia_7_0= ruleDouble ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getSalarioAccess().getPrevidenciaKeyword_4_0());
                    			
                    // InternalSalarioLiquido.g:192:4: ( (lv_previdencia_7_0= ruleDouble ) )
                    // InternalSalarioLiquido.g:193:5: (lv_previdencia_7_0= ruleDouble )
                    {
                    // InternalSalarioLiquido.g:193:5: (lv_previdencia_7_0= ruleDouble )
                    // InternalSalarioLiquido.g:194:6: lv_previdencia_7_0= ruleDouble
                    {

                    						newCompositeNode(grammarAccess.getSalarioAccess().getPrevidenciaDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_previdencia_7_0=ruleDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSalarioRule());
                    						}
                    						set(
                    							current,
                    							"previdencia",
                    							lv_previdencia_7_0,
                    							"br.ufrn.ppgti.ppgti1007.SalarioLiquido.Double");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSalario"


    // $ANTLR start "entryRuleDouble"
    // InternalSalarioLiquido.g:216:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalSalarioLiquido.g:216:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalSalarioLiquido.g:217:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalSalarioLiquido.g:223:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalSalarioLiquido.g:229:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalSalarioLiquido.g:230:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalSalarioLiquido.g:230:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalSalarioLiquido.g:231:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_8); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
            		
            // InternalSalarioLiquido.g:238:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSalarioLiquido.g:239:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,15,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});

}