package com.github.catvod.spider.merge.W;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f648short = {26614, 26194, 19217, 31593, 32156, -31190, 22091, 23204, 23496, 26165, -27236, 21165, 21213, -1391, 19288, 24754, 26268, 23005, 21058, 31436, 25774, 25866, 18505, 30769, 32452, -31374, 21779, 23036, 22672, 25965, -26940, 20981, 20869, -1591, 18432, 25578, 26052, 23173, 20762, 31124};
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ D(Activity activity, FrameLayout frameLayout, int i) {
        this.a = i;
        this.b = activity;
        this.c = frameLayout;
    }

    /* renamed from: ۤ۟ۨۥ, reason: not valid java name and contains not printable characters */
    public static short[] m5913() {
        if (C0006.m1726() < 0) {
            return f648short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0027.m5021(this)) {
            case 0:
                AlertDialog alertDialogM4124 = C0019.m4124(C0047.m7848(new AlertDialog.Builder(C0006.m1748(this)), C0036.m6200(this)));
                if (C0000.m1119(alertDialogM4124) != null) {
                    C0035.m6135(C0000.m1119(alertDialogM4124), new ColorDrawable(0));
                }
                C0038.m6402(C0025.m4795(m5913(), 20, 20, 1733));
                C0025.m4769(alertDialogM4124, new E());
                break;
            default:
                AlertDialog alertDialogM41242 = C0019.m4124(C0047.m7848(new AlertDialog.Builder(C0006.m1748(this)), C0036.m6200(this)));
                if (C0000.m1119(alertDialogM41242) != null) {
                    C0035.m6135(C0000.m1119(alertDialogM41242), new ColorDrawable(0));
                }
                C0038.m6402(C0056.m8911(m5913(), 0, 20, 1437));
                C0025.m4769(alertDialogM41242, new E());
                break;
        }
    }
}