package com.github.catvod.spider.merge.W;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge.W.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0225a implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f649short = {-30757, 25604, 24316, -30740, 24236, 24512, -29290, -31769, 22525, 26059, 23716, -25743, -29171};
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ RunnableC0225a(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    /* renamed from: ۣ۠ۤۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5914() {
        if (C0013.m3167() >= 0) {
            return f649short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0046.m7734(this)) {
            case 0:
                h hVarM5393 = C0030.m5393(this);
                C0047.m7777(hVarM5393);
                try {
                    AlertDialog alertDialog = (AlertDialog) C0020.m4247(hVarM5393);
                    if (alertDialog != null) {
                        C0004.m1577(alertDialog);
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                h hVarM53932 = C0030.m5393(this);
                C0047.m7777(hVarM53932);
                try {
                    hVarM53932.c = C0022.m4453();
                    int iM3103 = C0013.m3103(16);
                    int iM31032 = C0013.m3103(8);
                    int iM31033 = C0013.m3103(40);
                    C0015.m3432(hVarM53932);
                    LinearLayout linearLayout = new LinearLayout((Activity) C0024.m4735(hVarM53932));
                    C0032.m5684(linearLayout, 1);
                    C0016.m3608(linearLayout, iM3103, iM3103, iM3103, iM3103);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 7; i++) {
                        f fVarM9329 = C0060.m9329(hVarM53932, iM31033, iM31032, i);
                        C0037.m6336(linearLayout, C0063.m9494(fVarM9329));
                        C0004.m1532(arrayList, fVarM9329);
                    }
                    hVarM53932.b = C0019.m4124(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder((Activity) C0024.m4735(hVarM53932)), C0046.m7718(m5914(), 0, 9, 405)), linearLayout), C0034.m6001(m5914(), 9, 4, 1449), new DialogInterfaceOnClickListenerC0226b(0, hVarM53932)), R.string.cancel, null), R.string.ok, new DialogInterfaceOnClickListenerC0227c(hVarM53932, arrayList, 0)));
                    break;
                } catch (Exception e) {
                    C0049.m7975(e);
                }
        }
    }
}