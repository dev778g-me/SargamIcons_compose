package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiHospital: ImageVector
    get() {
        if (_SiHospital != null) {
            return _SiHospital!!
        }
        _SiHospital = ImageVector.Builder(
            name = "Regular.SiHospital",
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
                moveTo(17f, 2f)
                verticalLineToRelative(17.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.6f)
                verticalLineTo(2f)
                moveToRelative(18f, 4f)
                verticalLineToRelative(13.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineToRelative(-4.2f)
                moveTo(12f, 22f)
                verticalLineToRelative(-3.2f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineTo(8.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(22f)
                moveTo(2f, 2f)
                horizontalLineToRelative(16f)
                moveToRelative(-1f, 4f)
                horizontalLineToRelative(5f)
                moveToRelative(-12f, 0.5f)
                verticalLineToRelative(6f)
                moveToRelative(-3f, -3f)
                horizontalLineToRelative(6f)
            }
        }.build()

        return _SiHospital!!
    }

@Suppress("ObjectPropertyName")
private var _SiHospital: ImageVector? = null
