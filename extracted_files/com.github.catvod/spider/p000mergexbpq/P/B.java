package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.Q.a;
import com.github.catvod.spider.p000mergexbpq.Q.l;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class B<Symbol, ATNInterpreter extends l> {
    protected ATNInterpreter b;
    private List<a> a = new A();
    private int c = -1;

    static {
        new WeakHashMap();
        new WeakHashMap();
    }

    /* renamed from: ۡ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static List m789(Object obj) {
        if (C0012.m3024() > 0) {
            return ((B) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۤۧۡ, reason: not valid java name and contains not printable characters */
    public static l m790(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((B) obj).b;
        }
        return null;
    }

    /* renamed from: ۦۤ۟۟, reason: contains not printable characters */
    public static int m791(Object obj) {
        if (C0006.m1726() < 0) {
            return ((B) obj).c;
        }
        return 0;
    }

    public abstract a f();

    public final a g() {
        return new y(m789(this));
    }

    public final ATNInterpreter h() {
        return (ATNInterpreter) m790(this);
    }

    public final int i() {
        return m791(this);
    }

    public boolean j(int i) {
        return true;
    }

    public final void k(int i) {
        this.c = i;
    }
}