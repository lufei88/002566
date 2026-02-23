package com.github.catvod.spider.merge.h0;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.RunnableC0241b;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0330j implements View.OnClickListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f817short = {2400, 2425, 2418, 2377, 2424, 2423, 2427, 2419, 1290, 1295, 1289, 1298};
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ViewOnClickListenerC0330j(C0340u c0340u, String str, String str2, JSONObject jSONObject) {
        this.a = 2;
        this.d = c0340u;
        this.b = str2;
        this.c = jSONObject;
    }

    public /* synthetic */ ViewOnClickListenerC0330j(Object obj, String str, Button button, int i) {
        this.a = i;
        this.d = obj;
        this.b = str;
        this.c = button;
    }

    /* renamed from: ۥۣۤۧ, reason: contains not printable characters */
    public static short[] m8669() {
        if (C0034.m6048() <= 0) {
            return f817short;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (C0045.m7615(this)) {
            case 0:
                C0335o c0335o = (C0335o) C0024.m4734(this);
                C0030.m5391(c0335o, C0059.m9243(this));
                Button button = (Button) C0011.m2763(this);
                C0046.m7683(button, new RunnableC0241b(c0335o, button, 8));
                return;
            case 1:
                C0340u c0340u = (C0340u) C0024.m4734(this);
                C0038.m6455(c0340u, C0059.m9243(this));
                Button button2 = (Button) C0011.m2763(this);
                C0046.m7683(button2, new RunnableC0241b(c0340u, button2, 10));
                return;
            default:
                C0340u c0340u2 = (C0340u) C0024.m4734(this);
                String strM9243 = C0059.m9243(this);
                JSONObject jSONObject = (JSONObject) C0011.m2763(this);
                C0047.m7777(c0340u2);
                try {
                    String strM1212 = C0001.m1212(jSONObject, C0029.m5256(m8669(), 0, 8, 2326));
                    try {
                        AlertDialog alertDialogM3296 = C0014.m3296(c0340u2);
                        if (alertDialogM3296 != null) {
                            C0004.m1577(alertDialogM3296);
                        }
                    } catch (Exception unused) {
                    }
                    C0036.m6174().b = C0012.m2973(m8669(), 8, 4, 1402);
                    C0335o c0335oM6168 = C0035.m6168();
                    c0335oM6168.k = strM9243;
                    c0335oM6168.l = strM1212;
                    C0016.m3575(new RunnableC0328h(c0335oM6168, 1));
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}