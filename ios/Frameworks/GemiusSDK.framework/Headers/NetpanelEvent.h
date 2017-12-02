//
//  NetpanelEvent.h
//  GemiusSDK
//
//  Copyright (c) 2016 Gemius. All rights reserved.
//

#import "BaseEvent.h"

@interface GEMNetpanelEvent : GEMBaseEvent

//Setters
//-------------------------------------
-(void)setReferrer:(NSString*)referrer;
-(void)setPageUrl:(NSString*)pageUrl;
-(void)setCustomUserAgent:(NSString*)userAgent;

//Methods
//-------------------------------------
-(void)removeReferer;
-(void)removePageUrl;
-(void)resetUserAgent;
@end
