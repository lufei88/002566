package com.github.catvod.spider.merge.F0;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.e0.ViewOnKeyListenerC0289h;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f419short = {28010, 25695, -29891, 23388, 22489, 23239, 2251, 2281, 2302, 2275, 2300, 2275, 2302, 2291};
    public final HashMap a;

    public S(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap();
                try {
                    Activity activityM4453 = C0022.m4453();
                    if (activityM4453 != null) {
                        C0026.m4941(this, C0034.m6044(C0014.m3365(C0018.m3916(activityM4453)), R.id.content));
                    } else {
                        C0012.m2969(C0043.m7298(), C0065.m9775(m3856(), 0, 14, 2186));
                    }
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                this.a = new HashMap();
                break;
        }
    }

    /* renamed from: ۣ۟ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m3856() {
        if (C0040.m6582() >= 0) {
            return f419short;
        }
        return null;
    }

    public void a(View view) {
        if (C0036.m6251(view)) {
            C0023.m4575(view, new ViewOnKeyListenerC0289h(this));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < C0026.m4897(viewGroup); i++) {
                C0026.m4941(this, C0051.m8237(viewGroup, i));
            }
        }
    }
}