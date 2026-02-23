package com.github.catvod.spider.merge.b0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.github.catvod.spider.HBleiJing;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f752short = {2222, 2212, 2226, 2224, 2249, 2248, 2186, 2179, 2191, 2188, 2191, 2184, 2177, 2181, 2189};
    public final /* synthetic */ int a;
    public final /* synthetic */ HBleiJing b;

    public /* synthetic */ g(HBleiJing hBleiJing, int i) {
        this.a = i;
        this.b = hBleiJing;
    }

    /* renamed from: ۧ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7520() {
        if (C0001.m1164() < 0) {
            return f752short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0001.m1141(this)) {
            case 0:
                HBleiJing hBleiJingM2089 = C0009.m2089(this);
                C0047.m7777(hBleiJingM2089);
                try {
                    AlertDialog alertDialogM6826 = C0041.m6826(hBleiJingM2089);
                    if (alertDialogM6826 != null) {
                        C0004.m1577(alertDialogM6826);
                    }
                } catch (Exception unused) {
                }
                C0004.m1513(C0042.m7151(m7520(), 0, 15, 2278));
                break;
            default:
                HBleiJing hBleiJingM20892 = C0009.m2089(this);
                C0047.m7777(hBleiJingM20892);
                try {
                    AlertDialog alertDialogM68262 = C0041.m6826(hBleiJingM20892);
                    if (alertDialogM68262 != null) {
                        C0004.m1577(alertDialogM68262);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}