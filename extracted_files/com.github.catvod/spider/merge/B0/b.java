package com.github.catvod.spider.merge.b0;

import android.content.DialogInterface;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.RunnableC0225a;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f748short = {1985, 1951, 2009, 1940, 2035, 1992, 1993, 1984, 1997, 1992, 738, 700, 762, 695, 720, 747, 746, 739, 750, 747};
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    /* renamed from: ۦۡۨۢ, reason: contains not printable characters */
    public static short[] m7516() {
        if (C0033.m5872() >= 0) {
            return f748short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0016.m3570(this)) {
            case 0:
                C0007.m1876(C0057.m9003(), C0041.m6779(m7516(), 10, 10, 655));
                break;
            case 1:
                C0007.m1876(C0000.m1129(), C0011.m2805(m7516(), 0, 10, 1964));
                break;
            case 2:
                C0016.m3575(new com.github.catvod.spider.merge.F.b(15, C0032.m5712()));
                break;
            case 3:
                C0001.m1155(C0060.m9300());
                break;
            default:
                com.github.catvod.spider.merge.W.h hVarM2820 = C0011.m2820();
                C0047.m7777(hVarM2820);
                C0016.m3575(new RunnableC0225a(hVarM2820, 0));
                C0016.m3575(new RunnableC0225a(hVarM2820, 1));
                break;
        }
    }
}