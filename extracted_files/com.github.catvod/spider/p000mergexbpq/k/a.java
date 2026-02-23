package com.github.catvod.spider.p000mergexbpq.k;

import com.github.catvod.spider.merge.d.C0047;
import okhttp3.Call;
import okhttp3.Response;

/* loaded from: classes.dex */
public abstract class a extends c<Response> {
    /* renamed from: ۥۦ۠ۢ, reason: contains not printable characters */
    public static Response m3187(Object obj, Object obj2, Object obj3) {
        if (C0047.m7837() >= 0) {
            return ((a) obj).onParseResponse2((Call) obj2, (Response) obj3);
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.k.c
    public /* bridge */ /* synthetic */ Response onParseResponse(Call call, Response response) {
        return m3187(this, call, response);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.k.c
    /* renamed from: onParseResponse, reason: avoid collision after fix types in other method */
    public Response onParseResponse2(Call call, Response response) {
        return response;
    }
}