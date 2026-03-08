package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiNotificationsAlt: ImageVector
    get() {
        if (_SiNotificationsAlt != null) {
            return _SiNotificationsAlt!!
        }
        _SiNotificationsAlt = ImageVector.Builder(
            name = "Duotone.SiNotificationsAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.894f, -1.447f)
                lineTo(6f, 12.764f)
                verticalLineTo(10f)
                curveToRelative(0f, -3.728f, 2.55f, -6.86f, 6f, -7.748f)
                curveToRelative(3.45f, 0.888f, 6f, 4.02f, 6f, 7.748f)
                verticalLineToRelative(2.764f)
                lineToRelative(1.894f, 3.789f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 18f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 0f)
                moveToRelative(-3f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.894f, -1.447f)
                lineTo(6f, 12.763f)
                verticalLineTo(10f)
                curveToRelative(0f, -3.728f, 2.55f, -6.86f, 6f, -7.748f)
                curveToRelative(3.45f, 0.888f, 6f, 4.02f, 6f, 7.748f)
                verticalLineToRelative(2.764f)
                lineToRelative(1.894f, 3.789f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 18f)
                close()
            }
        }.build()

        return _SiNotificationsAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiNotificationsAlt: ImageVector? = null
