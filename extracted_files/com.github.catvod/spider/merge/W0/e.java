package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.u0.C0374a;
import com.github.catvod.spider.merge.y0.InterfaceC0416b;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public abstract class e extends b implements com.github.catvod.spider.merge.y0.e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f866short = {3047, 2994, 2997, 2994, 2991, 3045, 597, 601, 600, 581, 578, 580, 579, 597, 578, 601, 580, 534, 542, 637, 601, 578, 602, 607, 600, 534, 580, 595, 592, 602, 595, 597, 578, 607, 601, 600, 534, 607, 581, 534, 600, 601, 578, 534, 599, 576, 599, 607, 602, 599, 596, 602, 595, 543, 1927, 1940, 1935, 1922, 1941, 1928, 1934, 1935, 1985, 1185, 1193, 1226, 1262, 1269, 1261, 1256, 1263, 1185, 1267, 1252, 1255, 1261, 1252, 1250, 1269, 1256, 1262, 1263, 1185, 1256, 1266, 1185, 1263, 1262, 1269, 1185, 1248, 1271, 1248, 1256, 1261, 1248, 1251, 1261, 1252, 1192};
    private final int arity;
    private final int flags;

    public e(Object obj) {
        super(obj, false);
        this.arity = 1;
        this.flags = 0;
    }

    /* renamed from: ۟ۥۦۥۦ, reason: not valid java name and contains not printable characters */
    public static int m9476(Object obj) {
        if (C0044.m7508() < 0) {
            return ((e) obj).arity;
        }
        return 0;
    }

    /* renamed from: ۡۡۢ۠, reason: not valid java name and contains not printable characters */
    public static int m9477(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((e) obj).flags;
        }
        return 0;
    }

    /* renamed from: ۣۢۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m9478() {
        if (C0037.m6350() < 0) {
            return f866short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.w0.b
    public InterfaceC0416b computeReflected() {
        C0047.m7777(C0041.m6755());
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return C0007.m1815(C0014.m3375(this), C0014.m3375(eVar)) && C0007.m1815(C0040.m6630(this), C0040.m6630(eVar)) && m9477(this) == m9477(eVar) && m9476(this) == m9476(eVar) && C0000.m1134(C0056.m8863(this), C0056.m8863(eVar)) && C0000.m1134(C0000.m1049(this), C0000.m1049(eVar));
        }
        if (obj instanceof com.github.catvod.spider.merge.y0.e) {
            return C0058.m9103(obj, C0047.m7793(this));
        }
        return false;
    }

    public int getArity() {
        return m9476(this);
    }

    @Override // com.github.catvod.spider.merge.w0.b
    public /* bridge */ /* synthetic */ InterfaceC0416b getReflected() {
        return C0041.m6756(this);
    }

    @Override // com.github.catvod.spider.merge.w0.b
    public com.github.catvod.spider.merge.y0.e getReflected() {
        InterfaceC0416b interfaceC0416bM7793 = C0047.m7793(this);
        if (interfaceC0416bM7793 != this) {
            return (com.github.catvod.spider.merge.y0.e) interfaceC0416bM7793;
        }
        throw new C0374a();
    }

    public int hashCode() {
        return C0054.m8590(C0040.m6630(this)) + ((C0054.m8590(C0014.m3375(this)) + (C0000.m1049(this) == null ? 0 : C0050.m8087(C0000.m1049(this)) * 31)) * 31);
    }

    @Override // com.github.catvod.spider.merge.y0.e
    public boolean isExternal() {
        return C0008.m1968(C0041.m6756(this));
    }

    @Override // com.github.catvod.spider.merge.y0.e
    public boolean isInfix() {
        return C0028.m5124(C0041.m6756(this));
    }

    @Override // com.github.catvod.spider.merge.y0.e
    public boolean isInline() {
        return C0004.m1507(C0041.m6756(this));
    }

    @Override // com.github.catvod.spider.merge.y0.e
    public boolean isOperator() {
        return C0044.m7464(C0041.m6756(this));
    }

    @Override // com.github.catvod.spider.merge.y0.e
    public boolean isSuspend() {
        return C0006.m1692(C0041.m6756(this));
    }

    public String toString() {
        InterfaceC0416b interfaceC0416bM7793 = C0047.m7793(this);
        if (interfaceC0416bM7793 != this) {
            return C0037.m6312(interfaceC0416bM7793);
        }
        if (C0007.m1815(C0026.m4951(m9478(), 0, 6, 3035), C0014.m3375(this))) {
            return C0006.m1774(m9478(), 6, 48, 566);
        }
        StringBuilder sb = new StringBuilder(C0042.m7151(m9478(), 54, 9, 2017));
        C0018.m3933(sb, C0014.m3375(this));
        C0018.m3933(sb, C0039.m6551(m9478(), 63, 37, 1153));
        return C0047.m7763(sb);
    }
}