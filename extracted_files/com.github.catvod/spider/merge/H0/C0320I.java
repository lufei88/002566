package com.github.catvod.spider.merge.h0;

import android.widget.CompoundButton;
import android.widget.Switch;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.h0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0320I implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Switch b;

    public /* synthetic */ C0320I(Switch r52, int i) {
        this.a = i;
        this.b = r52;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (C0020.m4275(this)) {
            case 0:
                C0016.m3543(C0018.m3939(this), !z);
                break;
            default:
                C0016.m3543(C0018.m3939(this), !z);
                break;
        }
    }
}