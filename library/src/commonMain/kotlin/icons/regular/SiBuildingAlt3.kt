package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiBuildingAlt3: ImageVector
    get() {
        if (_SiBuildingAlt3 != null) {
            return _SiBuildingAlt3!!
        }
        _SiBuildingAlt3 = ImageVector.Builder(
            name = "Regular.SiBuildingAlt3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 2f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -4f)
                horizontalLineTo(6f)
                moveToRelative(12f, 0f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 4f)
                verticalLineToRelative(13.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                moveTo(18f, 6f)
                horizontalLineToRelative(4f)
                moveToRelative(-6.4f, 16f)
                horizontalLineToRelative(4f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(6f)
                moveToRelative(-6.4f, 16f)
                horizontalLineTo(14f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-4f)
                moveToRelative(4f, 0f)
                verticalLineToRelative(-3.2f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineToRelative(-2.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(22f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.4f)
                moveToRelative(0f, 0f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19.6f)
                verticalLineTo(6f)
                moveToRelative(2.4f, 16f)
                horizontalLineTo(4.3f)
                curveTo(2.975f, 22f, 2f, 20.878f, 2f, 19.553f)
                verticalLineTo(6f)
                moveToRelative(4f, 0f)
                verticalLineTo(2f)
                moveToRelative(0f, 4f)
                horizontalLineTo(2f)
                moveToRelative(4f, -4f)
                horizontalLineTo(5f)
                moveToRelative(17f, 4f)
                horizontalLineToRelative(1f)
                moveTo(2f, 6f)
                horizontalLineTo(1f)
                moveToRelative(9f, 0f)
                horizontalLineToRelative(4f)
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(4f)
                moveToRelative(-4f, 4f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _SiBuildingAlt3!!
    }

@Suppress("ObjectPropertyName")
private var _SiBuildingAlt3: ImageVector? = null
