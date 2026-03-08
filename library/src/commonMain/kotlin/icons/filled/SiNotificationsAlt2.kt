package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiNotificationsAlt2: ImageVector
    get() {
        if (_SiNotificationsAlt2 != null) {
            return _SiNotificationsAlt2!!
        }
        _SiNotificationsAlt2 = ImageVector.Builder(
            name = "Filled.SiNotificationsAlt2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.998f, 3f)
                arcToRelative(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.168f, 1.665f)
                arcToRelative(6.2f, 6.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.917f, 4.092f)
                lineToRelative(0.03f, 0.472f)
                arcToRelative(13.5f, 13.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.155f, 4.637f)
                lineToRelative(0.546f, 1.211f)
                arcToRelative(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.138f, 1.976f)
                curveToRelative(-0.185f, 0.29f, -0.441f, 0.53f, -0.742f, 0.696f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.982f, 0.251f)
                horizontalLineTo(16f)
                lineToRelative(-0.006f, 0.206f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.989f, 0f)
                lineTo(8f, 18f)
                horizontalLineTo(6.043f)
                curveToRelative(-0.342f, 0f, -0.678f, -0.088f, -0.978f, -0.254f)
                arcToRelative(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.74f, -0.695f)
                arcToRelative(2.08f, 2.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.142f, -1.973f)
                lineToRelative(0.545f, -1.212f)
                arcTo(13.5f, 13.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.882f, 9.23f)
                lineToRelative(0.031f, -0.472f)
                arcTo(6.2f, 6.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.83f, 4.665f)
                arcTo(6.07f, 6.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                moveTo(10f, 18f)
                lineToRelative(0.01f, 0.204f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 18f)
                close()
            }
        }.build()

        return _SiNotificationsAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiNotificationsAlt2: ImageVector? = null
