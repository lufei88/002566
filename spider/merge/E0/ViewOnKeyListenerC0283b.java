package com.github.catvod.spider.merge.e0;

import android.view.KeyEvent;
import android.view.View;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* renamed from: com.github.catvod.spider.merge.e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0283b implements View.OnKeyListener {
    public final /* synthetic */ C0288g a;

    public /* synthetic */ ViewOnKeyListenerC0283b(C0288g c0288g) {
        this.a = c0288g;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C0288g c0288gM8084 = C0050.m8084(this);
        C0047.m7777(c0288gM8084);
        if (C0006.m1722(keyEvent) != 0) {
            return false;
        }
        switch (i) {
            case 19:
            case 20:
            case 21:
            case 22:
                C0040.m6677(C0013.m3158(c0288gM8084));
                break;
        }
        return false;
    }
}