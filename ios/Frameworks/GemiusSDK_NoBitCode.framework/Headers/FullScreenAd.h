//
//  AdInterstitial.h
//  GemiusSDK
//
//  Copyright (c) 2016 Gemius. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import "AdDefine.h"

@interface GEMFullScreenAd : NSObject
@property(nonatomic, copy) NSString                         *placementId;
@property(nonatomic, weak) UIViewController                 *rootViewController;
@property (nonatomic, copy) onGEMAdReadyBlock                onAdReady;
@property (nonatomic, copy) onGEMFailBlock                   onFail;
@property (nonatomic, copy) onGEMAdClosedBlock               onAdClosed;


-(GEMFullScreenAd*)initWithPlacementId:(NSString *)placementId andRootViewController:(UIViewController *)viewController;
-(void)setPlacementId:(NSString *)placementId;
-(void)setCustomRequestParamWithKey:(NSString *)key andValue:(NSString *)value;
//-(void)setCompleteRequestURL:(NSString*)url;

/*!
 @param NSArray of strings
 */
-(void)setKeywords:(NSArray *)keywords;

/*!
 @param NSDictionary with NSString for key and NSNumber for value
 */
-(void)setNumericalVariables:(NSDictionary *)variables;

/*!
 @param NSDictionary with NSString for key and NSArray of number for value
 */
-(void)setClusterVariables:(NSDictionary *)clusterVariables;

-(void)setLandscapeAllowed:(BOOL)isAllowed;
-(void)open;
-(void)load;
-(void)close;
@end
