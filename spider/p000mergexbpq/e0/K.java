package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class K extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f314short = {2401, 2358, 2362, 2351, 2360, 2355, 2366, 2344, 2419, 2430, 2344, 2418};
    private final Pattern a;

    public K(Pattern pattern) {
        this.a = pattern;
    }

    /* renamed from: ۟ۤۤۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m2648() {
        if (C0043.m7332() >= 0) {
            return f314short;
        }
        return null;
    }

    /* renamed from: ۟ۦ۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static Pattern m2649(Object obj) {
        if (C0048.m7971() > 0) {
            return ((K) obj).a;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return C0003.m1405(C0034.m6026(m2649(this), C0053.m8412(lVar2)));
    }

    public final String toString() {
        return C0002.m1327(C0005.m1645(m2648(), 0, 12, 2395), new Object[]{m2649(this)});
    }
}