/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.frege.editor;

import org.antlr.v4.runtime.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author rhegde
 */
public class FrLexer implements Lexer<FregeTokenId> {

    private final LexerRestartInfo<FregeTokenId> info;

    private final FregeLexer fregeLexer;

    public FrLexer(LexerRestartInfo<FregeTokenId> info) {
        this.info = info;

        AntlrCharStream charStream = new AntlrCharStream(info.input(), "FregeEditor");
        fregeLexer = new FregeLexer(charStream);
    }

    @Override
    public org.netbeans.api.lexer.Token<FregeTokenId> nextToken() {
        Token token = fregeLexer.nextToken();
        if (token.getType() != FregeLexer.EOF) {
            FregeTokenId tokenId = FregeLanguageHierarchy.getToken(token.getType());
            System.out.println(" TOKEN -> " + tokenId.name());
            return info.tokenFactory().createToken(tokenId);
        }
        return null;
    }

    @Override
    public Object state() {
        return null;
    }

    @Override
    public void release() {}
}