/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.frege.editor;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author rhegde
 */
public class FregeLanguageHierarchy extends LanguageHierarchy<FregeTokenId> {

    private static final List<FregeTokenId> tokens = new ArrayList<>();
    private static final Map<Integer, FregeTokenId> idToToken = new HashMap<>();

    static {
        TokenType[] tokenTypes = TokenType.values();
        for (TokenType tokenType : tokenTypes) {
            tokens.add(new FregeTokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (FregeTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized FregeTokenId getToken(int id) {
        return idToToken.get(id);
    }

    protected synchronized Collection<FregeTokenId> createTokenIds() {
        return tokens;
    }

    @Override
    protected synchronized Lexer<FregeTokenId> createLexer(LexerRestartInfo<FregeTokenId> info) {
        return new FrLexer(info);
    }

    protected String mimeType() {
        return "text/x-sqlr";
    }
}
