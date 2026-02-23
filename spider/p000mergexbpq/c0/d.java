package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.Z.b;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f181short = {857, 793, 798, 795, 782, 795, 2654, 2627, 2617, 2593, 2598, 2595, 2614, 2595, 2617, 2096, 2096, 2131};

    public d(String str) {
        super(str);
    }

    /* renamed from: ۟۟۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2172() {
        if (C0006.m1726() <= 0) {
            return f181short;
        }
        return null;
    }

    /* renamed from: ۣۢۤۡ, reason: not valid java name and contains not printable characters */
    public static String m2173(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((p) obj).I();
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.u
    public final /* bridge */ /* synthetic */ u K() {
        return C0016.m3550(this);
    }

    public final d N() {
        return (d) super.K();
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.u, com.github.catvod.spider.p000mergexbpq.c0.r
    public final /* bridge */ /* synthetic */ Object clone() {
        return C0016.m3550(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.u, com.github.catvod.spider.p000mergexbpq.c0.r
    public final /* bridge */ /* synthetic */ r j() {
        return C0016.m3550(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.u, com.github.catvod.spider.p000mergexbpq.c0.r
    public final String t() {
        return C0004.m1549(m2172(), 0, 6, 890);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.u, com.github.catvod.spider.p000mergexbpq.c0.r
    final void w(Appendable appendable, int i, g gVar) {
        C0024.m4699(C0024.m4699(appendable, C0047.m7833(m2172(), 6, 9, 2658)), m2173(this));
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.u, com.github.catvod.spider.p000mergexbpq.c0.r
    final void x(Appendable appendable, int i, g gVar) {
        try {
            C0024.m4699(appendable, C0011.m2805(m2172(), 15, 3, 2157));
        } catch (IOException e) {
            throw new b(e);
        }
    }
}