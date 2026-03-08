package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSpark: ImageVector
    get() {
        if (_SiSpark != null) {
            return _SiSpark!!
        }
        _SiSpark = ImageVector.Builder(
            name = "Duotone.SiSpark",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(18f)
                moveToRelative(-9.005f, 9.005f)
                verticalLineToRelative(-18f)
                moveToRelative(-6.362f, 15.36f)
                lineTo(18.36f, 5.637f)
                moveToRelative(0f, 12.735f)
                lineTo(5.632f, 5.644f)
            }
        }.build()

        return _SiSpark!!
    }

@Suppress("ObjectPropertyName")
private var _SiSpark: ImageVector? = null
