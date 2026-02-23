package com.github.catvod.spider.merge.I0;

import com.github.catvod.spider.merge.E0.d;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f459short = {2130, 2091, 2081, 2088, 2128};
    public final d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* renamed from: ۟ۦۨۦۦ, reason: not valid java name and contains not printable characters */
    public static short[] m4195() {
        if (C0037.m6350() < 0) {
            return f459short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.I0.b
    public Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        C0047.m7777(cVar);
        return null;
    }

    @Override // com.github.catvod.spider.merge.I0.b
    public final String getText() {
        return C0024.m4730(C0050.m8126(this));
    }

    public final String toString() {
        d dVarM8126 = C0050.m8126(this);
        return C0022.m4461(dVarM8126) == -1 ? C0026.m4951(m4195(), 0, 5, 2158) : C0024.m4730(dVarM8126);
    }
}