package com.github.catvod.spider.p000mergexbpq.j;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f355short = {1434, 1433};
    private static final HashMap<Character, Character> a = new HashMap<>();

    public static void a() {
        C0007.m1815(C0035.m6102(C0045.m7549()), C0045.m7657(m3076(), 0, 2, 1486));
        char[] cArrM4078 = C0019.m4078(C0058.m9070());
        char[] cArrM40782 = C0019.m4078(C0055.m8759());
        int length = cArrM4078.length;
        for (int i = 0; i < length; i++) {
            C0053.m8424(m3075(), C0006.m1775(cArrM40782[i]), C0006.m1775(cArrM4078[i]));
        }
    }

    /* renamed from: ۟۠۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static HashMap m3075() {
        if (C0030.m5375() > 0) {
            return a;
        }
        return null;
    }

    /* renamed from: ۥۨۨ, reason: contains not printable characters */
    public static short[] m3076() {
        if (C0005.m1599() < 0) {
            return f355short;
        }
        return null;
    }
}