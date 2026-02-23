package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f450short = {1555};
    public final Object a;
    public Object b;

    public b(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    /* renamed from: ۠۟ۤۧ, reason: not valid java name and contains not printable characters */
    public static short[] m4137() {
        if (C0004.m1557() <= 0) {
            return f450short;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0037.m6312(C0032.m5738(this)));
        C0018.m3933(sb, C0012.m2973(m4137(), 0, 1, 1577));
        C0018.m3933(sb, C0037.m6312(C0024.m4749(this)));
        return C0047.m7763(sb);
    }
}