package com.github.catvod.spider.merge.a0;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.HBhaiM;
import com.github.catvod.spider.HBleiJing;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f714short = {27664, -27535, -30572, -29456, 20998, -27244, -24613, 835, 768, 776, -32143, -31211, 22755, 25841, 30579, 2470, 2533, 2541, 1366, 1329, 1339, 1325, 1327, 1366, 1367, 1294, 1304, 1307, 1309, 1304, 1295};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ P(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* renamed from: ۟ۦۨۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6942() {
        if (C0063.m9589() < 0) {
            return f714short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM8477 = C0053.m8477(m6942(), 0, 2, 533);
        Object objM1308 = C0002.m1308(this);
        int i = 1;
        int i2 = 0;
        Object objM4781 = C0025.m4781(this);
        Object objM8939 = C0056.m8939(this);
        Object objM8271 = C0051.m8271(this);
        switch (C0033.m5894(this)) {
            case 0:
                C0047.m7777((S) objM8271);
                C0030.m5390(C0001.m1203(new String[]{(String) objM8939, (String) objM4781, (String) objM1308}), C0049.m8007(m6942(), 18, 13, 1401));
                C0004.m1587();
                break;
            case 1:
                HBhaiM hBhaiM = (HBhaiM) objM8271;
                C0047.m7777(hBhaiM);
                AlertDialog alertDialogM4124 = C0019.m4124(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder((Context) objM8939), C0032.m5708(m6942(), 10, 8, 2438)), (LinearLayout) objM4781), strM8477, new com.github.catvod.spider.merge.b0.f(hBhaiM, i2)), R.string.cancel, new com.github.catvod.spider.merge.b0.f(hBhaiM, i)), R.string.ok, new DialogInterfaceOnClickListenerC0227c(hBhaiM, (EditText) objM1308, 6)));
                hBhaiM.j = alertDialogM4124;
                C0025.m4769(alertDialogM4124, new com.github.catvod.spider.merge.W.E());
                break;
            default:
                HBleiJing hBleiJing = (HBleiJing) objM8271;
                C0047.m7777(hBleiJing);
                AlertDialog alertDialogM41242 = C0019.m4124(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder((Context) objM8939), C0014.m3332(m6942(), 2, 8, 867)), (LinearLayout) objM4781), strM8477, new com.github.catvod.spider.merge.b0.g(hBleiJing, i2)), R.string.cancel, new com.github.catvod.spider.merge.b0.g(hBleiJing, i)), R.string.ok, new DialogInterfaceOnClickListenerC0227c(hBleiJing, (EditText) objM1308, 7)));
                hBleiJing.i = alertDialogM41242;
                C0025.m4769(alertDialogM41242, new com.github.catvod.spider.merge.W.E());
                break;
        }
    }
}