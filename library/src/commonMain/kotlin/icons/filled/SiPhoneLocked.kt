package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPhoneLocked: ImageVector
    get() {
        if (_SiPhoneLocked != null) {
            return _SiPhoneLocked!!
        }
        _SiPhoneLocked = ImageVector.Builder(
            name = "Filled.SiPhoneLocked",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.5f, 5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(1.025f)
                curveToRelative(0.85f, 0.143f, 1.5f, 0.885f, 1.5f, 1.775f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.212f, -0.988f, 2.2f, -2.2f, 2.2f)
                horizontalLineToRelative(-4.6f)
                curveToRelative(-1.212f, 0f, -2.2f, -0.988f, -2.2f, -2.2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.89f, 0.65f, -1.632f, 1.5f, -1.775f)
                close()
                moveTo(18.5f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                lineTo(16.5f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.684f, 16.73f)
                lineTo(7.18f, 10.27f)
                reflectiveCurveTo(13.684f, 5.537f, 6.25f, 3f)
                curveTo(6.252f, 3f, 3f, 3.115f, 3f, 7.846f)
                curveToRelative(0f, 2.308f, 1.626f, 4.846f, 3.716f, 6.808f)
                curveToRelative(0.368f, 0.348f, 0.76f, 0.735f, 1.17f, 1.142f)
                curveToRelative(2.317f, 2.292f, 5.26f, 5.204f, 8.12f, 5.204f)
                curveTo(20.769f, 21f, 21f, 17.654f, 21f, 17.654f)
                curveToRelative(-2.206f, -6.462f, -6.62f, -1.73f, -7.316f, -0.923f)
            }
        }.build()

        return _SiPhoneLocked!!
    }

@Suppress("ObjectPropertyName")
private var _SiPhoneLocked: ImageVector? = null
