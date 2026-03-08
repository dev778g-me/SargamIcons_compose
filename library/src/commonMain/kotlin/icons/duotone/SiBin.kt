package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiBin: ImageVector
    get() {
        if (_SiBin != null) {
            return _SiBin!!
        }
        _SiBin = ImageVector.Builder(
            name = "Duotone.SiBin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(19f, 19.6f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineToRelative(11.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.4f, 22f)
                horizontalLineToRelative(9.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 8f)
                verticalLineToRelative(11.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(7.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 19.6f)
                verticalLineTo(8f)
                moveToRelative(11f, -3f)
                verticalLineTo(3.2f)
                curveToRelative(0f, -0.66f, -0.54f, -1.2f, -1.2f, -1.2f)
                horizontalLineTo(9.2f)
                curveTo(8.54f, 2f, 8f, 2.54f, 8f, 3.2f)
                verticalLineTo(5f)
                moveToRelative(8f, 0f)
                horizontalLineTo(8f)
                moveToRelative(8f, 0f)
                horizontalLineToRelative(5f)
                moveTo(8f, 5f)
                horizontalLineTo(3f)
                moveToRelative(9f, 6f)
                verticalLineToRelative(6f)
                moveToRelative(3f, -6f)
                verticalLineToRelative(6f)
                moveToRelative(-6f, -6f)
                verticalLineToRelative(6f)
            }
        }.build()

        return _SiBin!!
    }

@Suppress("ObjectPropertyName")
private var _SiBin: ImageVector? = null
