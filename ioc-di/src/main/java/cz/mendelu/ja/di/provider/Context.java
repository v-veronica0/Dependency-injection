package cz.mendelu.ja.di.provider;

import cz.mendelu.ja.di.app.Controller;

public class Context {

    public static ContextBuilder builder() {
        return new ContextBuilder();
    }

    public <B> B get(String controller) {
        return null;
    }
}
