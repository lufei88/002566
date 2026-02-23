package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.f.C0051;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class B {
    public static final C0198m a;
    public static final C0209s b;
    public static final C0211t c;
    public static final C0213u d;
    public static final C0215v e;
    public static final C0217w f;
    public static final C0219x g;
    public static final C0221y h;
    public static final C0223z i;
    public static final C0178c j;
    public static final C0180d k;
    public static final C0182e l;
    public static final C0184f m;
    public static final C0186g n;
    public static final C0188h o;
    public static final C0190i p;
    public static final C0192j q;
    public static final C0194k r;
    public static final C0196l s;
    public static final C0200n t;
    public static final C0202o u;
    public static final C0204p v;
    public static final C0206q w;
    public static final String x;
    public static final /* synthetic */ B[] y;

    static {
        C0198m c0198m = new C0198m();
        a = c0198m;
        C0209s c0209s = new C0209s();
        b = c0209s;
        C0211t c0211t = new C0211t();
        c = c0211t;
        C0213u c0213u = new C0213u();
        d = c0213u;
        C0215v c0215v = new C0215v();
        e = c0215v;
        C0217w c0217w = new C0217w();
        f = c0217w;
        C0219x c0219x = new C0219x();
        g = c0219x;
        C0221y c0221y = new C0221y();
        h = c0221y;
        C0223z c0223z = new C0223z();
        i = c0223z;
        C0178c c0178c = new C0178c();
        j = c0178c;
        C0180d c0180d = new C0180d();
        k = c0180d;
        C0182e c0182e = new C0182e();
        l = c0182e;
        C0184f c0184f = new C0184f();
        m = c0184f;
        C0186g c0186g = new C0186g();
        n = c0186g;
        C0188h c0188h = new C0188h();
        o = c0188h;
        C0190i c0190i = new C0190i();
        p = c0190i;
        C0192j c0192j = new C0192j();
        q = c0192j;
        C0194k c0194k = new C0194k();
        r = c0194k;
        C0196l c0196l = new C0196l();
        s = c0196l;
        C0200n c0200n = new C0200n();
        t = c0200n;
        C0202o c0202o = new C0202o();
        u = c0202o;
        C0204p c0204p = new C0204p();
        v = c0204p;
        C0206q c0206q = new C0206q();
        w = c0206q;
        y = new B[]{c0198m, c0209s, c0211t, c0213u, c0215v, c0217w, c0219x, c0221y, c0223z, c0178c, c0180d, c0182e, c0184f, c0186g, c0188h, c0190i, c0192j, c0194k, c0196l, c0200n, c0202o, c0204p, c0206q, new B() { // from class: com.github.catvod.spider.merge.U0.r

            /* renamed from: short, reason: not valid java name */
            private static final short[] f608short = {295, 270, 275, 260, 264, 262, 271, 290, 270, 271, 277, 260, 271, 277};

            {
                C0051.m8259(f608short, 0, 14, 353);
            }

            @Override // com.github.catvod.spider.merge.U0.B
            public final boolean c(N n2, C0176b c0176b) {
                return true;
            }
        }};
        x = String.valueOf((char) 0);
    }

    public B(String str, int i2) {
    }

    public static boolean a(N n2) {
        if (n2.a == 5) {
            return com.github.catvod.spider.merge.S0.b.d(((G) n2).b);
        }
        return false;
    }

    public static void b(L l2, C0176b c0176b) {
        c0176b.c.o(g1.e);
        c0176b.m = c0176b.l;
        c0176b.l = h;
        c0176b.r(l2);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) y.clone();
    }

    public abstract boolean c(N n2, C0176b c0176b);
}