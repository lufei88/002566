package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.JSDemo;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.whl.quickjs.wrapper.JSObject;
import com.whl.quickjs.wrapper.QuickJSContext;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f755short = {2222, 2233, 2218, 2296, 2220, 2237, 2208, 2220, 2296, 2277, 2296, 2303, 2224, 2231, 2229, 2237, 2203, 2231, 2230, 2220, 2237, 2230, 2220, 2303, 2275, 955, 938, 951, 955};
    public final /* synthetic */ JSDemo a;

    public /* synthetic */ j(JSDemo jSDemo) {
        this.a = jSDemo;
    }

    /* renamed from: ۠ۥۤۨ, reason: not valid java name and contains not printable characters */
    public static short[] m7526() {
        if (C0042.m7147() <= 0) {
            return f755short;
        }
        return null;
    }

    /* renamed from: ۤ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m7527(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            return ((JSObject) obj).getString((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۟ۧۡ, reason: contains not printable characters */
    public static JSObject m7528(Object obj) {
        if (C0036.m6252() >= 0) {
            return ((QuickJSContext) obj).getGlobalObject();
        }
        return null;
    }

    /* renamed from: ۨۤۦۤ, reason: not valid java name and contains not printable characters */
    public static Object m7529(Object obj, Object obj2) {
        if (C0005.m1599() <= 0) {
            return ((QuickJSContext) obj).evaluate((String) obj2);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        JSDemo jSDemoM1312 = C0002.m1312(this);
        m7529(C0004.m1533(jSDemoM1312), C0048.m7902(m7526(), 0, 25, 2264));
        return m7527(m7528(C0004.m1533(jSDemoM1312)), C0030.m5362(m7526(), 25, 4, 975));
    }
}