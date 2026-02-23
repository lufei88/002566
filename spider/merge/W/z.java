package com.github.catvod.spider.merge.W;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.h0.C0340u;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements View.OnFocusChangeListener {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f662short = {2264, 2271, 2241, 2244, 2245, 2286, 2268, 2260, 2245, 2265, 2270, 2261};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5949() {
        if (C0008.m1975() > 0) {
            return f662short;
        }
        return null;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (C0018.m3945(this)) {
            case 0:
                C c = (C) C0054.m8555(this);
                if (!z) {
                    C0047.m7777(c);
                    break;
                } else {
                    WebView webViewM7622 = C0045.m7622(c);
                    if (webViewM7622 != null) {
                        C0040.m6677(webViewM7622);
                        break;
                    }
                }
                break;
            case 1:
                C c2 = (C) C0054.m8555(this);
                if (!z) {
                    C0047.m7781(C0015.m3456(c2), new y(c2, 1));
                    break;
                } else {
                    C0047.m7777(c2);
                    break;
                }
            default:
                C0340u c0340u = (C0340u) C0054.m8555(this);
                if (!z) {
                    C0047.m7777(c0340u);
                    C0023.m4606((InputMethodManager) C0011.m2781(C0031.m5652(), C0007.m1842(m5949(), 0, 12, 2225)), C0010.m2384(C0049.m8034(c0340u)), 0);
                    break;
                } else if (!C0043.m7327(C0065.m9797(C0049.m8034(c0340u)))) {
                    C0049.m8041(C0049.m8034(c0340u));
                    C0039.m6494(C0049.m8034(c0340u), true);
                    C0053.m8441(C0049.m8034(c0340u), true);
                    break;
                }
                break;
        }
    }
}