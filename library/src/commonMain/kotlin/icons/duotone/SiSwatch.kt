package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSwatch: ImageVector
    get() {
        if (_SiSwatch != null) {
            return _SiSwatch!!
        }
        _SiSwatch = ImageVector.Builder(
            name = "Duotone.SiSwatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(3f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.7f, -0.24f, 1.346f, -0.643f, 1.856f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 18f)
                horizontalLineToRelative(-0.008f)
                moveTo(6f, 21f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
                horizontalLineToRelative(-4.787f)
                moveTo(6f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 0f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.7f, -0.24f, 1.346f, -0.643f, 1.856f)
                moveTo(6f, 21f)
                curveToRelative(0.956f, 0f, 1.808f, -0.447f, 2.357f, -1.144f)
                moveTo(9f, 10.728f)
                lineToRelative(3.607f, -3.607f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.242f, 4.243f)
                lineToRelative(-8.492f, 8.492f)
            }
        }.build()

        return _SiSwatch!!
    }

@Suppress("ObjectPropertyName")
private var _SiSwatch: ImageVector? = null
