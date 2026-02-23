package com.github.catvod.spider.merge.b0;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.github.catvod.spider.HBhaiM;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f751short = {1125, 1135, 1145, 1147, 1026, 1027, 1093, 1100, 1092, 1088, 1092, 1100, 1091, 1102, 1094};
    public final /* synthetic */ int a;
    public final /* synthetic */ HBhaiM b;

    public /* synthetic */ f(HBhaiM hBhaiM, int i) {
        this.a = i;
        this.b = hBhaiM;
    }

    /* renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static short[] m7519() {
        if (C0004.m1557() <= 0) {
            return f751short;
        }
        return null;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (C0001.m1148(this)) {
            case 0:
                HBhaiM hBhaiMM1567 = C0004.m1567(this);
                C0047.m7777(hBhaiMM1567);
                try {
                    AlertDialog alertDialogM7375 = C0043.m7375(hBhaiMM1567);
                    if (alertDialogM7375 != null) {
                        C0004.m1577(alertDialogM7375);
                    }
                } catch (Exception unused) {
                }
                C0004.m1513(C0062.m9389(m7519(), 0, 15, 1069));
                break;
            default:
                HBhaiM hBhaiMM15672 = C0004.m1567(this);
                C0047.m7777(hBhaiMM15672);
                try {
                    AlertDialog alertDialogM73752 = C0043.m7375(hBhaiMM15672);
                    if (alertDialogM73752 != null) {
                        C0004.m1577(alertDialogM73752);
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}