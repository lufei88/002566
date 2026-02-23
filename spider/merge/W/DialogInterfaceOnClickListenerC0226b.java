package com.github.catvod.spider.merge.W;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0246g;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a0.RunnableC0234C;
import com.github.catvod.spider.merge.a0.RunnableC0237F;
import com.github.catvod.spider.merge.a0.RunnableC0244e;
import com.github.catvod.spider.merge.a0.S;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.Q;
import com.github.catvod.spider.merge.h0.RunnableC0321a;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import java.io.File;

/* renamed from: com.github.catvod.spider.merge.W.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC0226b implements DialogInterface.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f650short = {1684, 1681, 1694, 1693, 1669, 1673, 1667, 22879, 31330, 25807, 23968, 31250, -30398, -25995, -28919, 23492, -31009};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ DialogInterfaceOnClickListenerC0226b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* renamed from: ۟۟۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m5915() {
        if (C0025.m4797() > 0) {
            return f650short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0020.m4272(this)) {
            case 0:
                h hVar = (h) C0035.m6150(this);
                C0047.m7777(hVar);
                try {
                    C0005.m1648();
                    File file = new File(C0003.m1375(C0022.m4453()), C0034.m6001(m5915(), 0, 7, 1776));
                    if (C0028.m5187(file)) {
                        C0046.m7663(file);
                    }
                    C0052.m8327(hVar);
                    AlertDialog alertDialog = (AlertDialog) C0020.m4247(hVar);
                    if (alertDialog != null) {
                        C0004.m1577(alertDialog);
                    }
                    C0038.m6402(C0025.m4795(m5915(), 7, 10, 1197));
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            case 1:
                C0246g c0246g = (C0246g) C0035.m6150(this);
                C0054.m8579(c0246g);
                C0025.m4829(new RunnableC0244e(c0246g, 3));
                return;
            case 2:
                C0246g c0246g2 = (C0246g) C0035.m6150(this);
                C0054.m8579(c0246g2);
                C0025.m4829(new RunnableC0234C(c0246g2, 2));
                return;
            case 3:
                C0254o c0254o = (C0254o) C0035.m6150(this);
                C0056.m8936(c0254o);
                C0025.m4829(new RunnableC0237F(c0254o, 2));
                return;
            case 4:
                S s = (S) C0035.m6150(this);
                C0045.m7652(s);
                C0025.m4829(new RunnableC0321a(s, 1));
                return;
            case 5:
                C0031.m5587((com.github.catvod.spider.merge.h0.x) C0035.m6150(this));
                return;
            case 6:
                S s2 = (S) C0035.m6150(this);
                C0045.m7652(s2);
                C0025.m4829(new com.github.catvod.spider.merge.h0.y(s2, 2));
                return;
            case 7:
                Q q = (Q) C0035.m6150(this);
                C0047.m7777(q);
                try {
                    AlertDialog alertDialogM3660 = C0017.m3660(q);
                    if (alertDialogM3660 != null) {
                        C0004.m1577(alertDialogM3660);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                Q q2 = (Q) C0035.m6150(this);
                C0047.m7777(q2);
                try {
                    AlertDialog alertDialogM36602 = C0017.m3660(q2);
                    if (alertDialogM36602 != null) {
                        C0004.m1577(alertDialogM36602);
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}